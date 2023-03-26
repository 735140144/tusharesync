package luckyboy.schedule;

import luckyboy.params.index.*;
import luckyboy.result.index.IndexBasicResult;
import luckyboy.result.index.ThsIndexResult;
import luckyboy.service.IndexDataService;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootConfiguration
public class IndexScheduleJob {
    @Autowired
    private IndexDataService indexDataService;

    @Bean(name = "index_basic")
    public Worker index_basic(){
        return () -> {
            IndexBasicParams build = IndexBasicParams.builder().build();
            indexDataService.index_basic(build);
        };
    }

    @Bean(name = "index_daily")
    public Worker index_daily(){
        return () -> {
            List<IndexBasicResult> allIndex = indexDataService.getAllIndex();
            for (IndexBasicResult index : allIndex) {
                IndexDailyParams build = IndexDailyParams.builder().ts_code(index.getTs_code()).trade_date(DataFormat.NowDay()).build();
                indexDataService.index_daily(build);
            }
        };
    }

    @Bean(name = "index_weekly")
    public Worker index_weekly(){
        return () -> {
            IndexWeeklyParams build = IndexWeeklyParams.builder().trade_date(DataFormat.NowDay()).build();
            indexDataService.index_weekly(build);
        };
    }

    @Bean(name = "index_monthly")
    public Worker index_monthly(){
        return () -> {
            IndexMonthlyParams build = IndexMonthlyParams.builder().trade_date(DataFormat.YesterDay()).build();
            indexDataService.index_monthly(build);
        };
    }

    @Bean(name = "index_weight")
    public Worker index_weight(){
        return () -> {
            IndexWeightParams build = IndexWeightParams.builder().trade_date(DataFormat.NowDay()).build();
            indexDataService.index_weight(build);
        };
    }

    @Bean(name = "index_dailybasic")
    public Worker index_dailybasic(){
        return () -> {
            IndexDailybasicParams build = IndexDailybasicParams.builder().trade_date(DataFormat.NowDay()).build();
            indexDataService.index_dailybasic(build);
        };
    }

    @Bean(name = "index_classify")
    public Worker index_classify(){
        return () -> {
            IndexClassifyParams build = IndexClassifyParams.builder().build();
            indexDataService.index_classify(build);
        };
    }

    @Bean(name = "index_member")
    public Worker index_member(){
        return () -> {
            IndexMemberParams build = IndexMemberParams.builder().build();
            indexDataService.index_member(build);
        };
    }

    @Bean(name = "daily_info")
    public Worker  daily_info(){
        return () -> {
            DailyInfoParams build = DailyInfoParams.builder().trade_date(DataFormat.NowDay()).build();
            indexDataService.daily_info(build);
        };
    }

    @Bean(name = "sz_daily_info")
    public Worker sz_daily_info(){
        return () -> {
            SzDailyInfoParams build = SzDailyInfoParams.builder().trade_date(DataFormat.NowDay()).build();
            indexDataService.sz_daily_info(build);
        };
    }

    @Bean(name = "ths_index")
    public Worker ths_index(){
        return () -> {
            ThsIndexParams build = ThsIndexParams.builder().build();
            indexDataService.ths_index(build);
        };
    }

    @Bean(name = "ths_daily")
    public Worker ths_daily(){
        return () -> {
            ThsDailyParams build = ThsDailyParams.builder().trade_date(DataFormat.NowDay()).build();
            indexDataService.ths_daily(build);
        };
    }

    @Bean(name = "ths_member")
    public Worker ths_member(){
        return () -> {
            List<ThsIndexResult> allThs = indexDataService.getAllThs();
            for (ThsIndexResult allTh : allThs) {
                ThsMemberParams build = ThsMemberParams.builder().ts_code(allTh.getTs_code()).build();
                indexDataService.ths_member(build);
            }
        };
    }

    @Bean(name = "index_global")
    public Worker index_global(){
        return () -> {
            IndexGlobalParams build = IndexGlobalParams.builder().trade_date(DataFormat.YesterDay()).build();
            indexDataService.index_global(build);
        };
    }
}
