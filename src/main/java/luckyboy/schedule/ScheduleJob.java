package luckyboy.schedule;

import luckyboy.params.hsStock.*;
import luckyboy.service.*;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@SpringBootConfiguration
public class ScheduleJob {
    @Autowired
    private BasicDataService basicDataService;

    @Autowired
    private MarketDataService marketDataService;

    @Autowired
    private FinancialDataService financialDataService;

    @Autowired
    private ReferenceDataService referenceDataService;

    @Autowired
    private CharacteristicDataService characteristicDataService;

    @Bean(name = "StockBasic")
    public Worker StockBasic(){
        return () -> {
            StockBasicParams build = StockBasicParams.builder().build();
            basicDataService.StockBasic(build);
        };
    }

    @Bean(name = "TradeCal")
    public Worker TradeCal(){
        return () -> {
            TradeCalParams build = TradeCalParams.builder().start_date(DataFormat.NowDay()).build();
            basicDataService.TradeCal(build);
        };
    }

    @Bean(name = "NameChange")
    public Worker NameChange(){
        return () -> {
            NameChangeParams build = NameChangeParams.builder().start_date(DataFormat.NowDay()).build();
            basicDataService.NameChange(build);
        };
    }

    @Bean(name = "HsConst")
    public Worker HsConst(){
        return () -> {
            HsConstParams sh = HsConstParams.builder().hs_type("SH").build();
            basicDataService.HsConst(sh);
            HsConstParams sz = HsConstParams.builder().hs_type("SZ").build();
            basicDataService.HsConst(sz);
        };
    }

    @Bean(name = "StockCompany")
    public Worker StockCompany(){
        return () -> {
            StockCompanyParams sse = StockCompanyParams.builder().exchange("SSE").build();
            basicDataService.StockCompany(sse);
            StockCompanyParams szse = StockCompanyParams.builder().exchange("SZSE").build();
            basicDataService.StockCompany(szse);
        };
    }

//    @Bean(name = "
//    public Worker StkRewards(){
//        String s = DataFormat.DTFormat(System.currentTimeMillis());
//        basicDataService.StkRewards(null,s);
//    }

    @Bean(name = "NewShare")
    public Worker NewShare(){
        return () -> {
            NewShareParams build = NewShareParams.builder().start_date(DataFormat.NowDay()).end_date(DataFormat.NowDay()).build();
            basicDataService.NewShare(build);
        };
    }

    @Bean(name = "daily")
    public Worker daily(){
        return () -> {
            String s = DataFormat.DTFormat(System.currentTimeMillis());
            DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.daily(build);
        };
    }

    @Bean(name = "weekly")
    public Worker weekly(){
        return () -> {
            DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().trade_date(DataFormat.YesterDay()).build();
            marketDataService.weekly(build);
        };
    }

    @Bean(name = "monthly")
    public Worker monthly(){
        return () -> {
            DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().trade_date(DataFormat.YesterDay()).build();
            marketDataService.monthly(build);
        };
    }

    @Bean(name = "adjFactor")
    public Worker adjFactor(){
        return () -> {
            AdjFactorParams build = AdjFactorParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.adjFactor(build);
        };
    }

    @Bean(name = "suspendD")
    public Worker suspendD(){
        return () -> {
            SuspendDParams build = SuspendDParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.suspendD(build);
        };
    }

    @Bean(name = "daily_basic")
    public Worker daily_basic(){
        return () -> {
            DailyBasicParams build = DailyBasicParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.daily_basic(build);
        };
    }

    @Bean(name = "moneyflow")
    public Worker moneyflow(){
        return () -> {
            MoneyFlowParams build = MoneyFlowParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.moneyflow(build);
        };
    }

    @Bean(name = "stkLimit")
    public Worker stkLimit(){
        return () -> {
            StkLimitParams build = StkLimitParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.stkLimit(build);
        };
    }

    @Bean(name = "moneyflowHsgt")
    public Worker moneyflowHsgt(){
        return () -> {
            MoneyFlowHsgtParams build = MoneyFlowHsgtParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.moneyflowHsgt(build);
        };
    }

    @Bean(name = "hsgtTop10")
    public Worker hsgtTop10(){
        return () -> {
            HsgtTop10Params build = HsgtTop10Params.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.hsgtTop10(build);
        };
    }

    @Bean(name = "ggtTop10")
    public Worker ggtTop10(){
        return () -> {
            GgtTop10Params build = GgtTop10Params.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.ggtTop10(build);
        };
    }

    @Bean(name = "ggtDaily")
    public Worker ggtDaily(){
        return () -> {
            GgtDailyParams build = GgtDailyParams.builder().trade_date(DataFormat.NowDay()).build();
            marketDataService.ggtDaily(build);
        };
    }

    @Bean(name = "ggtMonthly")
    public Worker ggtMonthly(){
        return () -> {
            GgtMonthlyParams build = GgtMonthlyParams.builder().month(DataFormat.NowMonth()).build();
            marketDataService.ggtMonthly(build);
        };
    }

    /**
     * 财务数据
     */
    @Bean(name = "income_vip")
    public Worker getIncome(){
        return () -> {
            InComeParams params = InComeParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.income_vip(params);
        };
    }

    @Bean(name = "balancesheet_vip")
    public Worker getBalancesheet(){
        return () -> {
            BalanceSheetParams params = BalanceSheetParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.balancesheet_vip(params);
        };
    }

    @Bean(name = "cashflow_vip")
    public Worker getCashFlow(){
        return () -> {
            CashFlowParams params = CashFlowParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.cashflow_vip(params);
        };
    }

    @Bean(name = "forecast_vip")
    public Worker getForecast(){
        return () -> {
            ForecastParams params = ForecastParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.forecast_vip(params);
        };
    }

    @Bean(name = "express_vip")
    public Worker getExpress(){
        return () -> {
            ExpressParams params = ExpressParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.express_vip(params);
        };
    }

    @Bean(name = "dividend")
    public Worker getDivideng(){
        return () -> {
            DividendParams params = DividendParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.dividend(params);
        };
    }

    @Bean(name = "fina_indicator_vip")
    public Worker getFinaIndicator(){
        return () -> {
            FinaIndicatorParams params = FinaIndicatorParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.fina_indicator_vip(params);
        };
    }

    @Bean(name = "fina_audit")
    public Worker getFinaAudit(){
        return () -> {
            FinaAuditParams params = FinaAuditParams.builder().ann_date(DataFormat.NowDay()).build();
            financialDataService.fina_audit(params);
        };
    }

    @Bean(name = "fina_mainbz_vip")
    public Worker getFinaMainBz(){
        return () -> {
            FinaMainbzParams params = FinaMainbzParams.builder().period(DataFormat.Report()).build();
            financialDataService.fina_mainbz_vip(params);
        };
    }

    @Bean(name = "disclosure_date")
    public Worker getDisclosure(){
        return () -> {
            DisclosureDateParams params = DisclosureDateParams.builder().end_date(DataFormat.NextReport()).build();
            financialDataService.disclosure_date(params);
        };
    }

    /**
     *参考数据
     */
    @Bean(name = "margin")
    public Worker getMargin(){
        return () -> {
            MarginParams params = MarginParams.builder().trade_date(DataFormat.YesterDay()).build();
            referenceDataService.margin(params);
        };
    }

    @Bean(name = "margin_detail")
    public Worker getMarginDetail(){
        return () -> {
            MarginDetailParams params = MarginDetailParams.builder().trade_date(DataFormat.YesterDay()).build();
            referenceDataService.margin_detail(params);
        };
    }

    @Bean(name = "margin_target")
    public Worker getMarginTarget(){
        return () -> {
            MarginTargetParams params = MarginTargetParams.builder().build();
            referenceDataService.margin_target(params);
        };
    }

    @Bean(name = "top_list")
    public Worker getTopList(){
        return () -> {
            TopListParams params = TopListParams.builder().trade_date(DataFormat.NowDay()).build();
            referenceDataService.top_list(params);
        };
    }

    @Bean(name = "top_inst")
    public Worker getTopInst(){
        return () -> {
            TopInstParams params = TopInstParams.builder().trade_date(DataFormat.NowDay()).build();
            referenceDataService.top_inst(params);
        };
    }

    @Bean(name = "pledge_stat")
    public Worker getPledge(){
        return () -> {
            PledgeStatParams params = PledgeStatParams.builder().end_date(DataFormat.NowDay()).build();
            referenceDataService.pledge_stat(params);
        };
    }

    @Bean(name = "repurchase")
    public Worker getRepurchase(){
        return () -> {
            RepurchaseParams params = RepurchaseParams.builder().ann_date(DataFormat.NowDay()).build();
            referenceDataService.repurchase(params);
        };
    }

    @Bean(name = "concept")
    public Worker getConcept(){
        return () -> {
            ConceptParams build = ConceptParams.builder().build();
            referenceDataService.concept(build);
        };
    }

    @Bean(name = "share_float")
    public Worker getShareFloat(){
        return () -> {
            ShareFloatParams params = ShareFloatParams.builder().ann_date(DataFormat.NowDay()).build();
            referenceDataService.share_float(params);
        };
    }

    @Bean(name = "block_trade")
    public Worker getBlockTrade(){
        return () -> {
            BlockTradeParams params = BlockTradeParams.builder().trade_date(DataFormat.NowDay()).build();
            referenceDataService.block_trade(params);
        };
    }

    @Bean(name = "stk_holdernumber")
    public Worker getStkHoldernumber(){
        return () -> {
            StkHoldernumberParams params = StkHoldernumberParams.builder().enddate(DataFormat.NowDay()).build();
            referenceDataService.stk_holdernumber(params);
        };
    }

    @Bean(name = "stk_holdertrade")
    public Worker getStkHoldertrade(){
        return () -> {
            StkHoldertradeParams build = StkHoldertradeParams.builder().ann_date(DataFormat.NowDay()).build();
            referenceDataService.stk_holdertrade(build);
        };
    }

    /**
     * 特色数据
     */
    @Bean(name = "report_rc")
    public Worker report_rc(){
        return () -> {
            ReportRcParams build = ReportRcParams.builder().report_date(DataFormat.NowDay()).build();
            characteristicDataService.report_rc(build);
        };
    }

    @Bean(name = "cyq_perf")
    public Worker cyq_perf(){
        return () -> {
            CyqPerfParams build = CyqPerfParams.builder().trade_date(DataFormat.NowDay()).build();
            characteristicDataService.cyq_perf(build);
        };
    }

    @Bean(name = "stk_factor")
    public Worker  stk_factor(){
        return () -> {
            StkFactorParams build = StkFactorParams.builder().trade_date(DataFormat.NowDay()).build();
            characteristicDataService.stk_factor(build);
        };
    }

    @Bean(name = "ccass_hold")
    public Worker ccass_hold(){
        return () -> {
            CcassHoldParams build = CcassHoldParams.builder().trade_date(DataFormat.YesterDay()).build();
            characteristicDataService.ccass_hold(build);
        };
    }

    @Bean(name = "ccass_hold_detail")
    public Worker ccass_hold_detail(){
        return () -> {
            CcassHoldDetailParams build = CcassHoldDetailParams.builder().trade_date(DataFormat.YesterDay()).build();
            characteristicDataService.ccass_hold_detail(build);
        };
    }

    @Bean(name = "hk_hold")
    public Worker hk_hold(){
        return () -> {
            HkHoldParams sh = HkHoldParams.builder().trade_date(DataFormat.YesterDay()).exchange("SH").build();
            HkHoldParams sz = HkHoldParams.builder().trade_date(DataFormat.YesterDay()).exchange("SZ").build();
            HkHoldParams hk = HkHoldParams.builder().trade_date(DataFormat.YesterDay()).exchange("HK").build();
            characteristicDataService.hk_hold(sh);
            characteristicDataService.hk_hold(sz);
            characteristicDataService.hk_hold(hk);
        };
    }

    @Bean(name = "limit_list_d")
    public Worker limit_list_d(){
        return () -> {
            LimitListDParams sh = LimitListDParams.builder().trade_date(DataFormat.NowDay()).exchange("SH").build();
            LimitListDParams sz = LimitListDParams.builder().trade_date(DataFormat.NowDay()).exchange("SZ").build();
            LimitListDParams bj = LimitListDParams.builder().trade_date(DataFormat.NowDay()).exchange("BJ").build();
            characteristicDataService.limit_list_d(sh);
            characteristicDataService.limit_list_d(sz);
            characteristicDataService.limit_list_d(bj);
        };
    }

    @Bean(name = "stk_surv")
    public Worker stk_surv(){
        return () -> {
            StkSurvParams build = StkSurvParams.builder().trade_date(DataFormat.NowDay()).build();
            characteristicDataService.stk_surv(build);
        };
    }

    @Bean(name = "broker_recommend")
    public Worker broker_recommend(){
        return () -> {
            BrokerRecommendParams build = BrokerRecommendParams.builder().month(DataFormat.NowMonth()).build();
            characteristicDataService.broker_recommend(build);
        };
    }
}
