package luckyboy.config;

import lombok.AllArgsConstructor;
import luckyboy.schedule.Worker;
import luckyboy.schedule.vo.ScheduledCornJobVO;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;

@AllArgsConstructor
@SpringBootConfiguration
public class TaskConfig {
    @Bean(name = "workerMap")
    public Map<Long, Worker> workerMap() {
        return new ConcurrentHashMap<>();
    }

    @Bean(name = "triggerMap")
    public Map<Long, Trigger> triggerMap() {
        return new ConcurrentHashMap<>();
    }

    @Bean(name = "scheduledFutureMap")
    public Map<String, ScheduledFuture> scheduledFutureMap() {
        return new ConcurrentHashMap<>();
    }

    @Bean(name = "operationMap")
    public Map<String, Consumer<ScheduledCornJobVO>> operationMap() {
        return new ConcurrentHashMap<>();
    }

    @Bean(name = "threadPoolTaskScheduler")
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(Runtime.getRuntime().availableProcessors());
        threadPoolTaskScheduler.setThreadNamePrefix("WorKerThread:");
        threadPoolTaskScheduler.setWaitForTasksToCompleteOnShutdown(true);
        threadPoolTaskScheduler.setAwaitTerminationSeconds(30);
        return threadPoolTaskScheduler;
    }

}
