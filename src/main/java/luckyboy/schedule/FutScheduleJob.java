package luckyboy.schedule;

import luckyboy.params.fut.*;
import luckyboy.service.FutDataService;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@SpringBootConfiguration
public class FutScheduleJob {
    @Autowired
    private FutDataService futDataService;

    @Bean(name = "fut_basic")
    public Worker job1(){
        return () -> {
            futDataService.fut_basic(FutBasicParams.builder().exchange("CFFEX").build());
            futDataService.fut_basic(FutBasicParams.builder().exchange("DCE").build());
            futDataService.fut_basic(FutBasicParams.builder().exchange("CZCE").build());
            futDataService.fut_basic(FutBasicParams.builder().exchange("SHFE").build());
            futDataService.fut_basic(FutBasicParams.builder().exchange("INE").build());
            futDataService.fut_basic(FutBasicParams.builder().exchange("GFEX").build());
        };
    }

    @Bean(name = "fut_trade_cal")
    public Worker job2(){
        return () -> futDataService.fut_trade_cal(FutTradeCalParams.builder().start_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_daily")
    public Worker job3(){
        return () -> futDataService.fut_daily(FutDailyParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_holding")
    public Worker job4(){
        return () -> futDataService.fut_holding(FutHoldingParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_wsr")
    public Worker job5(){
        return () -> futDataService.fut_wsr(FutWsrParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_settle")
    public Worker job6(){
        return () -> futDataService.fut_settle(FutSettleParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_index_daily")
    public Worker job7(){
        return () -> futDataService.fut_index_daily(FutIndexDailyParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_mapping")
    public Worker job8(){
        return () -> futDataService.fut_mapping(FutMappingParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fut_weekly_detail")
    public Worker job9(){
        return () -> futDataService.fut_weekly_detail(FutWeeklyDetailParams.builder().week(DataFormat.curWeek()).build());
    }
}
