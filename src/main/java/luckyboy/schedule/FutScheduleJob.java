package luckyboy.schedule;

import luckyboy.params.fut.*;
import luckyboy.service.FutDataService;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FutScheduleJob {
    @Autowired
    private FutDataService futDataService;

    @Scheduled(cron = "0 10 22 ? * 1-5")
    public void job1(){
        futDataService.fut_basic(FutBasicParams.builder().exchange("CFFEX").build());
        futDataService.fut_basic(FutBasicParams.builder().exchange("DCE").build());
        futDataService.fut_basic(FutBasicParams.builder().exchange("CZCE").build());
        futDataService.fut_basic(FutBasicParams.builder().exchange("SHFE").build());
        futDataService.fut_basic(FutBasicParams.builder().exchange("INE").build());
        futDataService.fut_basic(FutBasicParams.builder().exchange("GFEX").build());
    }

    @Scheduled(cron = "1 10 22 1 1 ?")
    public void job2(){
        futDataService.fut_trade_cal(FutTradeCalParams.builder().start_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "2 10 22 ? * 1-5")
    public void job3(){
        futDataService.fut_daily(FutDailyParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "3 10 22 ? * 1-5")
    public void job4(){
        futDataService.fut_holding(FutHoldingParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "4 10 22 ? * 1-5")
    public void job5(){
        futDataService.fut_wsr(FutWsrParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "5 10 22 ? * 1-5")
    public void job6(){
        futDataService.fut_settle(FutSettleParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "6 10 22 ? * 1-5")
    public void job7(){
        futDataService.fut_index_daily(FutIndexDailyParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "7 10 22 ? * 1-5")
    public void job8(){
        futDataService.fut_mapping(FutMappingParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "8 10 22 ? * 6")
    public void job9(){
        futDataService.fut_weekly_detail(FutWeeklyDetailParams.builder().week(DataFormat.curWeek()).build());
    }
}
