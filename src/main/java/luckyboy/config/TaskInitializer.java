package luckyboy.config;

import lombok.AllArgsConstructor;
import lombok.var;
import luckyboy.schedule.Worker;
import luckyboy.schedule.vo.ScheduledCornJobVO;
import luckyboy.schedule.vo.ScheduledCornVO;
import luckyboy.schedule.vo.ScheduledJobVO;
import luckyboy.service.ScheduledCornJobService;
import luckyboy.service.ScheduledCornService;
import luckyboy.service.ScheduledJobService;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@SpringBootConfiguration
@AllArgsConstructor
public class TaskInitializer {
    // 依赖搜索:拿到spring容器中的所有实现类
    private final Map<String, Worker> allWorkerMap;

    // 依赖注入 Service
    private final ScheduledCornService scheduledCornService;
    private final ScheduledJobService scheduledJobService;
    private final ScheduledCornJobService scheduledCornJobService;

    // 依赖注入 容器bean
    // 工作注册表
    private final Map<Long, Worker> workerMap;
    // 触发器注册表
    private final Map<Long, Trigger> triggerMap;
    // 定时任务注册表
    private final Map<String, ScheduledFuture> scheduledFutureMap;
    // 操作注册表
    private final Map<String, Consumer<ScheduledCornJobVO>> operationMap;
    // 线程池
    private final ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @PostConstruct
    public void initMap() {
        // 初始化工作注册表
        initWorkerMap();

        // 初始化触发器注册表
        initTriggerMap();

        // 初始化ScheduledFuture注册表
        initScheduledFutureMap();

        // 初始化操作注册表
        initOperationMap();
    }

    private void initWorkerMap() {
        // 查询数据库配置的所有job记录
        var jobList = scheduledJobService.list();
        var effectiveWorkerMap = jobList.stream().collect(Collectors.toMap(ScheduledJobVO::getId, scheduledJob -> allWorkerMap.get(scheduledJob.getBeanName())));
        workerMap.putAll(effectiveWorkerMap);
    }

    private void initTriggerMap() {
        // 查询数据库配置的所有corn记录
        var cornList = scheduledCornService.list();
        var cronTriggerMap = cornList.stream().collect(Collectors.toMap(ScheduledCornVO::getId, ScheduledCornVO::toCronTrigger));
        triggerMap.putAll(cronTriggerMap);
    }

    private void initScheduledFutureMap() {
        // 查询数据库配置的corn-job关系表
        var cornJobList = scheduledCornJobService.list("1");
        cornJobList.forEach(cornJob -> {
            ScheduledFuture<?> schedule = threadPoolTaskScheduler.schedule((workerMap.get(cornJob.getJobId())), triggerMap.get(cornJob.getCornId()));
            scheduledFutureMap.put(cornJob.getStoreKey(), schedule);
        });
    }

    private void initOperationMap() {

        /**** 之前引发 bug处 *****/
        // 打开操作
        Consumer<ScheduledCornJobVO> open = cornJob -> {
            var key = cornJob.getStoreKey();
            // 将任务添加至注册表中进行维护，这里应该先判断存在再开启
            scheduledFutureMap.compute(key, (k, v) -> {
                Optional<ScheduledFuture> ov = Optional.ofNullable(v);
                ov.ifPresent(v0 -> v0.cancel(true));
                // 动态开启一个定时任务
                var schedule = threadPoolTaskScheduler.schedule(workerMap.get(cornJob.getJobId()), triggerMap.get(cornJob.getCornId()));
                // 这里应该直接返回最新打开的 schedule 定时任务对象，而不是原先的
                return schedule;
            });
        };

        // 关闭操作
        Consumer<ScheduledCornJobVO> close = cornJob -> {
            var key = cornJob.getStoreKey();
            // 取消此定时任务
            var scheduledFuture = scheduledFutureMap.get(key);
            Optional.ofNullable(scheduledFuture).ifPresent(os -> os.cancel(true));
            // 从注册表中移除
            scheduledFutureMap.remove(key);
        };

        operationMap.put("1", open);
        operationMap.put("0", close);
    }
}
