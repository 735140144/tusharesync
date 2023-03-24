package luckyboy.schedule;

import luckyboy.service.FailLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RetryScheduleJob {
    @Autowired
    private FailLogService failLogService;

    @Scheduled(cron = "0 0 12 * * ?")
    public void job1(){
        failLogService.Retry();
    }
}
