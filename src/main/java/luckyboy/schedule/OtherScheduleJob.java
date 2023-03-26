package luckyboy.schedule;


import luckyboy.params.cb.*;
import luckyboy.params.fx.FxDailyParams;
import luckyboy.params.fx.FxObasicParams;
import luckyboy.params.hk.HkBasicParams;
import luckyboy.params.hk.HkDailyParams;
import luckyboy.params.hk.HkTradecalParams;
import luckyboy.params.news.CctvNewsParams;
import luckyboy.params.news.NewsParams;
import luckyboy.params.opt.OptBasicParams;
import luckyboy.params.opt.OptDailyParams;
import luckyboy.params.sge.SgeBasicParams;
import luckyboy.params.sge.SgeDailyParams;
import luckyboy.params.stock.StockMxParams;
import luckyboy.params.stock.StockVxParams;
import luckyboy.params.tmt.*;
import luckyboy.params.us.UsBasicParams;
import luckyboy.params.us.UsTradecalParams;
import luckyboy.service.*;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class OtherScheduleJob {
    @Autowired
    private SgeDataService sgeDataService;

    @Autowired
    private OptDataService optDataService;

    @Autowired
    private CbDataService cbDataService;

    @Autowired
    private FxDataService fxDataService;

    @Autowired
    private HkDataService hkDataService;

    @Autowired
    private UsDataService usDataService;

    @Autowired
    private TmtDataService tmtDataService;

    @Autowired
    private StockDataService stockDataService;

    @Autowired
    private NewsDataService newsDataService;

    @Bean(name = "sge_basic")
    public Worker job1(){
        return () -> {
            SgeBasicParams build = SgeBasicParams.builder().build();
            sgeDataService.sge_basic(build);
        };
    }

    @Bean(name = "sge_daily")
    public Worker job2(){
        return () -> {
            SgeDailyParams build = SgeDailyParams.builder().trade_date(DataFormat.NowDay()).build();
            sgeDataService.sge_daily(build);
        };
    }

    @Bean(name = "opt_basic")
    public Worker job3(){
        return () -> {
            OptBasicParams build = OptBasicParams.builder().build();
            optDataService.opt_basic(build);
        };
    }

    @Bean(name = "opt_daily")
    public Worker job4(){
        return () -> {
            OptDailyParams build = OptDailyParams.builder().trade_date(DataFormat.NowDay()).build();
            optDataService.opt_daily(build);
        };
    }

    @Bean(name = "cb_basic")
    public Worker job5(){
        return () -> {
            CbBasicParams build = CbBasicParams.builder().build();
            cbDataService.cb_basic(build);
        };
    }

    @Bean(name = "cb_issue")
    public Worker job6(){
        return () -> {
            CbIssueParams build = CbIssueParams.builder().ann_date(DataFormat.NowDay()).build();
            cbDataService.cb_issue(build);
        };
    }

    @Bean(name = "cb_call")
    public Worker job7(){
        return () -> {
            CbCallParams build = CbCallParams.builder().build();
            cbDataService.cb_call(build);
        };
    }

    @Bean(name = "cb_daily")
    public Worker job8(){
        return () -> {
            CbDailyParams build = CbDailyParams.builder().trade_date(DataFormat.NowDay()).build();
            cbDataService.cb_daily(build);
        };
    }

        @Bean(name = "repo_daily")
    public Worker job9(){
        return () -> {
            RepoDailyParams build = RepoDailyParams.builder().trade_date(DataFormat.NowDay()).build();
            cbDataService.repo_daily(build);
        };
    }

    @Bean(name = "bond_blk")
    public Worker job10(){
        return () -> {
            BondBlkParams build = BondBlkParams.builder().trade_date(DataFormat.NowDay()).build();
            cbDataService.bond_blk(build);
        };
    }

        @Bean(name = "bond_blk_detail")
    public Worker job11(){
        return () -> {
            BondBlkDetailParams build = BondBlkDetailParams.builder().trade_date(DataFormat.NowDay()).build();
            cbDataService.bond_blk_detail(build);
        };
    }

    @Bean(name = "eco_cal")
    public Worker job12(){
        return () -> {
            EcoCalParams build = EcoCalParams.builder().date(DataFormat.YesterDay()).build();
            cbDataService.eco_cal(build);
        };
    }

    @Bean(name = "fx_obasic")
    public Worker job13(){
        return () -> {
            FxObasicParams build = FxObasicParams.builder().build();
            fxDataService.fx_obasic(build);
        };
    }

    @Bean(name = "fx_daily")
    public Worker job14(){
        return () -> {
            fxDataService.fx_daily(FxDailyParams.builder().trade_date(DataFormat.YesterDay()).build());
        };
    }

    @Bean(name = "hk_basic")
    public Worker job15(){
        return () -> {
            hkDataService.hk_basic(HkBasicParams.builder().build());
        };
    }

    @Bean(name = "hk_tradecal")
    public Worker job16(){
        return () -> {
            hkDataService.hk_tradecal(HkTradecalParams.builder().start_date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "hk_daily")
    public Worker job17(){
        return () -> {
            hkDataService.hk_daily(HkDailyParams.builder().trade_date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "us_basic")
    public Worker job18(){
        return () -> {
            usDataService.us_basic(UsBasicParams.builder().build());
        };
    }

    @Bean(name = "us_tradecal")
    public Worker job19(){
        return () -> {
            usDataService.us_tradecal(UsTradecalParams.builder().start_date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "tmt_twincome")
    public Worker job20(){
        return () -> {
            tmtDataService.tmt_twincome(TmtTwincomeParams.builder().date(DataFormat.NowDay()).item("8").build());
        };
    }

    @Bean(name = "tmt_twincomedetail")
    public Worker job21(){
        return () -> {
            tmtDataService.tmt_twincomedetail(TmtTwincomedetailParams.builder().date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "bo_monthly")
    public Worker job22(){
        return () -> {
            tmtDataService.bo_monthly(BoMonthlyParams.builder().date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "bo_weekly")
    public Worker job23(){
        return () -> {
            tmtDataService.bo_weekly(BoWeeklyParams.builder().date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "bo_daily")
    public Worker job24(){
        return () -> {
            tmtDataService.bo_daily(BoDailyParams.builder().date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "bo_cinema")
    public Worker job25(){
        return () -> {
            tmtDataService.bo_cinema(BoCinemaParams.builder().date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "film_record")
    public Worker job26(){
        return () -> {
            tmtDataService.film_record(FilmRecordParams.builder().ann_date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "teleplay_record")
    public Worker job27(){
        return () -> {
            tmtDataService.teleplay_record(TeleplayRecordParams.builder().report_date(DataFormat.NowMonth()).build());
        };
    }

    @Bean(name = "stock_mx")
    public Worker job28(){
        return () -> {
            stockDataService.stock_mx(StockMxParams.builder().trade_date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "stock_vx")
    public Worker job29(){
        return () -> {
            stockDataService.stock_vx(StockVxParams.builder().trade_date(DataFormat.NowDay()).build());
        };
    }

    @Bean(name = "news")
    public Worker job30(){
        return () -> {
            long l = System.currentTimeMillis();
            String end = DataFormat.DateTimeFormat(l);
            String start = DataFormat.DateTimeFormat(l - 5 * 60 * 1000L);
            newsDataService.news(NewsParams.builder().start_date(start).end_date(end).src("sina").build());
            newsDataService.news(NewsParams.builder().start_date(start).end_date(end).src("wallstreetcn").build());
            newsDataService.news(NewsParams.builder().start_date(start).end_date(end).src("10jqka").build());
            newsDataService.news(NewsParams.builder().start_date(start).end_date(end).src("eastmoney").build());
            newsDataService.news(NewsParams.builder().start_date(start).end_date(end).src("yuncaijing").build());
        };
    }

    @Bean(name = "cctv_news")
    public Worker job31(){
        return () -> {
            newsDataService.cctv_news(CctvNewsParams.builder().date(DataFormat.NowDay()).build());
        };
    }
}
