package luckyboy.schedule;

import luckyboy.common.FailLog;
import luckyboy.service.FailLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootConfiguration
public class RetryScheduleJob {
    @Autowired
    private FailLogService failLogService;

    @Bean(name = "Retry")
    public Worker job1(){
        return() -> failLogService.Retry();
    }

    @Bean(name = "test")
    public Worker test(){
        return () -> {
            List<FailLog> failLogs = failLogService.failJob();
            System.out.println(failLogs);
        };
    }
}
