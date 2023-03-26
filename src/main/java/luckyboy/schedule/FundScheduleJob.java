package luckyboy.schedule;

import luckyboy.params.fund.*;
import luckyboy.result.fund.FundBasicResult;
import luckyboy.service.FundDataService;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootConfiguration
public class FundScheduleJob {
    @Autowired
    private FundDataService fundDataService;

    @Bean(name = "fund_basic")
    public Worker job1() {
        return () -> {
            FundBasicParams build = FundBasicParams.builder().build();
            fundDataService.fund_basic(build);
        };
    }

    @Bean(name = "fund_company")
    public Worker job2() {
        return ()-> {
            FundCompanyParams build = FundCompanyParams.builder().build();
            fundDataService.fund_company(build);
        };
    }

    @Bean(name = "fund_manager")
    public Worker job3() {
        return () -> fundDataService.fund_manager(FundManagerParams.builder().ann_date(DataFormat.NowDay()).build());
    }


    @Bean(name = "fund_share")
    public Worker job4() {
        return () -> fundDataService.fund_share(FundShareParams.builder().trade_date(DataFormat.NowDay()).build());
    }


    @Bean(name = "fund_nav")
    public Worker job5() {
        return () -> fundDataService.fund_nav(FundNavParams.builder().nav_date(DataFormat.NowDay()).build());
    }


    @Bean(name = "fund_div")
    public Worker job6() {
        return () -> fundDataService.fund_div(FundDivParams.builder().ann_date(DataFormat.NowDay()).build());
    }


    @Bean(name = "fund_portfolio")
    public Worker job7() throws InterruptedException {
        return () -> {
            List<FundBasicResult> allfund = fundDataService.allfund();
            for (FundBasicResult fundBasicResult : allfund) {
                FundPortfolioParams build = FundPortfolioParams.builder().ts_code(fundBasicResult.getTs_code()).build();
                fundDataService.fund_portfolio(build);
                Thread.sleep(400);
            }
        };
    }


    @Bean(name = "fund_daily")
    public Worker job8() {
        return () -> fundDataService.fund_daily(FundDailyParams.builder().trade_date(DataFormat.NowDay()).build());
    }

    @Bean(name = "fund_adj")
    public Worker job9() {
        return () -> fundDataService.fund_adj(FundAdjParams.builder().trade_date(DataFormat.NowDay()).build());
    }
}
