package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import luckyboy.schedule.vo.ScheduledCornJobVO;
import luckyboy.service.ScheduledCornJobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Api(value = "任务调度", tags = "任务调度")
@RequiredArgsConstructor
@RestController
@RequestMapping("/jobtask")
public class TaskApi {
    private final ScheduledCornJobService scheduledCornJobService;

    private final Map<String, Consumer<ScheduledCornJobVO>> operationMap;

    // 向scheduled_corn_job中插入记录，并刷新定时任务
    @ApiOperation("新增任务")
    @PostMapping
    public String add(@RequestBody ScheduledCornJobVO scheduledCornJob) {
        // 操作关系表
        scheduledCornJobService.save(scheduledCornJob);
        // 刷新内存中定时任务
        refresh(scheduledCornJob.getId());
        return "操作成功";
    }

    @ApiOperation("更新任务")
    @PutMapping
    public String update(@RequestBody ScheduledCornJobVO scheduledCornJob) {
        // 操作关系表
        scheduledCornJobService.updateById(scheduledCornJob);
        // 刷新内存中定时任务
        refresh(scheduledCornJob.getId());
        return "操作成功";
    }

    // 刷新所有，我们为了测试方便,直接改表记录，调用此方法就行
    @ApiOperation("刷新缓存")
    @GetMapping("/refreshAll")
    public void refreshAll() {
        List<ScheduledCornJobVO> cornJobList = scheduledCornJobService.list();
        cornJobList.stream().forEach(this::refresh);
    }

    // 通过id去查询数据库完成单个定时任务的刷新,调用下面重载方法,传入查询的实时结果
    private void refresh(Long id) {
        refresh(scheduledCornJobService.getById(id));
    }

    // 重载方法：根据传入的查询的实时结果,拿到定时任务的状态（开启/关闭）,去operationMap中取对应操作来执行
    private void refresh(ScheduledCornJobVO cornJob) {
        operationMap.get(cornJob.getStatus()).accept(cornJob);
    }

}
