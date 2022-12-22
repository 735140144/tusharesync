package luckyboy.schedule;

import luckyboy.service.BasicDataService;
import luckyboy.service.Impl.BasicDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleJob {
    @Autowired
    private BasicDataServiceImpl basicDataService;

    @Scheduled(cron = "0 35 20 ? * 2-6")
    public void StockBasic(){
        basicDataService.StockBasic();
    }
}
