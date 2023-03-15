//package luckyboy.schedule;
//
//import luckyboy.params.index.*;
//import luckyboy.result.index.ThsIndexResult;
//import luckyboy.service.IndexDataService;
//import luckyboy.util.DataFormat;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class IndexScheduleJob {
//    @Autowired
//    private IndexDataService indexDataService;
//
//    @Scheduled(cron = "10 5 9 ? * 1-5")
//    public void index_basic(){
//        IndexBasicParams build = IndexBasicParams.builder().build();
//        indexDataService.index_basic(build);
//    }
//
//    @Scheduled(cron = "10 5 21 ? * 1-5")
//    public void index_daily(){
//        IndexDailyParams build = IndexDailyParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.index_daily(build);
//    }
//
//    @Scheduled(cron = "10 5 21 ? * 5")
//    public void index_weekly(){
//        IndexWeeklyParams build = IndexWeeklyParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.index_weekly(build);
//    }
//
//    @Scheduled(cron = "10 5 21 1 * ?")
//    public void index_monthly(){
//        IndexMonthlyParams build = IndexMonthlyParams.builder().trade_date(DataFormat.YesterDay()).build();
//        indexDataService.index_monthly(build);
//    }
//
//    @Scheduled(cron = "15 5 21 ? * 1-5")
//    public void index_weight(){
//        IndexWeightParams build = IndexWeightParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.index_weight(build);
//    }
//
//    @Scheduled(cron = "20 5 21 ? * 1-5")
//    public void index_dailybasic(){
//        IndexDailybasicParams build = IndexDailybasicParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.index_dailybasic(build);
//    }
//
//    @Scheduled(cron = "0 0 0 ? * *")
//    public void index_classify(){
//        IndexClassifyParams build = IndexClassifyParams.builder().build();
//        indexDataService.index_classify(build);
//    }
//
//    @Scheduled(cron = "20 0 0 ? * *")
//    public void index_member(){
//        IndexMemberParams build = IndexMemberParams.builder().build();
//        indexDataService.index_member(build);
//    }
//
//    @Scheduled(cron = "20 5 22 ? * 1-5")
//    public void  daily_info(){
//        DailyInfoParams build = DailyInfoParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.daily_info(build);
//    }
//
//    @Scheduled(cron = "30 5 22 ? * 1-5")
//    public void sz_daily_info(){
//        SzDailyInfoParams build = SzDailyInfoParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.sz_daily_info(build);
//    }
//
//    @Scheduled(cron = "0 6 22 ? * 1-5")
//    public void ths_index(){
//        ThsIndexParams build = ThsIndexParams.builder().build();
//        indexDataService.ths_index(build);
//    }
//
//    @Scheduled(cron = "0 7 22 ? * 1-5")
//    public void ths_daily(){
//        ThsDailyParams build = ThsDailyParams.builder().trade_date(DataFormat.NowDay()).build();
//        indexDataService.ths_daily(build);
//    }
//
//    @Scheduled(cron = "0 10 0 ? * 7")
//    public void ths_member(){
//        List<ThsIndexResult> allThs = indexDataService.getAllThs();
//        for (ThsIndexResult allTh : allThs) {
//            ThsMemberParams build = ThsMemberParams.builder().ts_code(allTh.getTs_code()).build();
//            indexDataService.ths_member(build);
//        }
//    }
//
//    @Scheduled(cron = "40 10 * ? * *")
//    public void index_global(){
//        IndexGlobalParams build = IndexGlobalParams.builder().trade_date(DataFormat.YesterDay()).build();
//        indexDataService.index_global(build);
//    }
//}
