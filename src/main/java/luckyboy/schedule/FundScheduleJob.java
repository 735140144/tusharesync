package luckyboy.schedule;

import luckyboy.params.fund.*;
import luckyboy.result.fund.FundBasicResult;
import luckyboy.service.FundDataService;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FundScheduleJob {
    @Autowired
    private FundDataService fundDataService;

    @Scheduled(cron = "0 25 22 ? * 1-5")
    public void job1(){
        FundBasicParams build = FundBasicParams.builder().build();
        fundDataService.fund_basic(build);
    }

    @Scheduled(cron = "2 25 22 ? * 1-5")
    public void job2(){
        FundCompanyParams build = FundCompanyParams.builder().build();
        fundDataService.fund_company(build);
    }

    @Scheduled(cron = "4 25 22 ? * 1-5")
    public void job3(){
        fundDataService.fund_manager(FundManagerParams.builder().ann_date(DataFormat.NowDay()).build());
    }


    @Scheduled(cron = "6 25 22 ? * 1-5")
    public void job4(){
        fundDataService.fund_share(FundShareParams.builder().trade_date(DataFormat.NowDay()).build());
    }


    @Scheduled(cron = "8 25 22 ? * 1-5")
    public void job5(){
        fundDataService.fund_nav(FundNavParams.builder().nav_date(DataFormat.NowDay()).build());
    }


    @Scheduled(cron = "10 25 22 ? * 1-5")
    public void job6(){
        fundDataService.fund_div(FundDivParams.builder().ann_date(DataFormat.NowDay()).build());
    }


    @Scheduled(cron = "0 0 22 1 * ?")
    public void job7() throws InterruptedException {
        List<FundBasicResult> allfund = fundDataService.allfund();
        for (FundBasicResult fundBasicResult : allfund) {
            FundPortfolioParams build = FundPortfolioParams.builder().ts_code(fundBasicResult.getTs_code()).build();
            fundDataService.fund_portfolio(build);
            Thread.sleep(400);
        }
    }


    @Scheduled(cron = "12 25 22 ? * 1-5")
    public void job8(){
        fundDataService.fund_daily(FundDailyParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Scheduled(cron = "14 25 22 ? * 1-5")
    public void job9(){
        fundDataService.fund_adj(FundAdjParams.builder().trade_date(DataFormat.NowDay()).build());
    }
}
