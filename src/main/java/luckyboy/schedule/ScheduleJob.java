package luckyboy.schedule;

import luckyboy.params.hsStock.*;
import luckyboy.service.*;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
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

    @Scheduled(cron = "0 0 9 ? * 1-5")
    public void StockBasic(){
        StockBasicParams build = StockBasicParams.builder().build();
        basicDataService.StockBasic(build);
    }

    @Scheduled(cron = "0 0 9 1 1 ?")
    public void TradeCal(){
        TradeCalParams build = TradeCalParams.builder().start_date(DataFormat.NowDay()).build();
        basicDataService.TradeCal(build);
    }

    @Scheduled(cron = "30 0 9 ? * 1-5")
    public void NameChange(){
        NameChangeParams build = NameChangeParams.builder().start_date(DataFormat.NowDay()).build();
        basicDataService.NameChange(build);
    }

    @Scheduled(cron = "0 0 15 ? * 1")
    public void HsConst(){
        HsConstParams sh = HsConstParams.builder().hs_type("SH").build();
        basicDataService.HsConst(sh);
        HsConstParams sz = HsConstParams.builder().hs_type("SZ").build();
        basicDataService.HsConst(sz);
    }

    @Scheduled(cron = "0 0 9 ? * 7")
    public void StockCompany(){
        StockCompanyParams sse = StockCompanyParams.builder().exchange("SSE").build();
        basicDataService.StockCompany(sse);
        StockCompanyParams szse = StockCompanyParams.builder().exchange("SZSE").build();
        basicDataService.StockCompany(szse);
    }

//    @Scheduled(cron = "0 0 8 * * ?")
//    public void StkRewards(){
//        String s = DataFormat.DTFormat(System.currentTimeMillis());
//        basicDataService.StkRewards(null,s);
//    }

    @Scheduled(cron = "0 30 8 * * ?")
    public void NewShare(){
        NewShareParams build = NewShareParams.builder().start_date(DataFormat.NowDay()).end_date(DataFormat.NowDay()).build();
        basicDataService.NewShare(build);
    }

    @Scheduled(cron = "0 0 19 ? * 1-5")
    public void daily(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.daily(build);
    }

    @Scheduled(cron = "30 0 19 ? * 6")
    public void weekly(){
        DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().trade_date(DataFormat.YesterDay()).build();
        marketDataService.weekly(build);
    }

    @Scheduled(cron = "0 1 19 1 * ?")
    public void monthly(){
        DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().trade_date(DataFormat.YesterDay()).build();
        marketDataService.monthly(build);
    }

    @Scheduled(cron = "0 2 19 ? * 1-5")
    public void adjFactor(){
        AdjFactorParams build = AdjFactorParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.adjFactor(build);
    }

    @Scheduled(cron = "0 3 19 ? * 1-5")
    public void suspendD(){
        SuspendDParams build = SuspendDParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.suspendD(build);
    }

    @Scheduled(cron = "0 4 19 ? * 1-5")
    public void daily_basic(){
        DailyBasicParams build = DailyBasicParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.daily_basic(build);
    }

    @Scheduled(cron = "0 4 19 ? * 1-5")
    public void moneyflow(){
        MoneyFlowParams build = MoneyFlowParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.moneyflow(build);
    }

    @Scheduled(cron = "0 20 9 ? * 1-5")
    public void stkLimit(){
        StkLimitParams build = StkLimitParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.stkLimit(build);
    }

    @Scheduled(cron = "30 4 22 ? * 1-5")
    public void moneyflowHsgt(){
        MoneyFlowHsgtParams build = MoneyFlowHsgtParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.moneyflowHsgt(build);
    }

    @Scheduled(cron = "0 5 23 ? * 1-5")
    public void hsgtTop10(){
        HsgtTop10Params build = HsgtTop10Params.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.hsgtTop10(build);
    }

    @Scheduled(cron = "0 6 23 ? * 1-5")
    public void ggtTop10(){
        GgtTop10Params build = GgtTop10Params.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.ggtTop10(build);
    }

    @Scheduled(cron = "0 7 23 ? * 1-5")
    public void ggtDaily(){
        GgtDailyParams build = GgtDailyParams.builder().trade_date(DataFormat.NowDay()).build();
        marketDataService.ggtDaily(build);
    }

    @Scheduled(cron = "0 5 9 1 * ?")
    public void ggtMonthly(){
        GgtMonthlyParams build = GgtMonthlyParams.builder().month(DataFormat.NowMonth()).build();
        marketDataService.ggtMonthly(build);
    }

    /**
     * 财务数据
     */
    @Scheduled(cron = "0 8 23 ? * 1-5")
    public void getIncome(){
        InComeParams params = InComeParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.income_vip(params);
    }

    @Scheduled(cron = "0 9 23 ? * 1-5")
    public void getBalancesheet(){
        BalanceSheetParams params = BalanceSheetParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.balancesheet_vip(params);
    }

    @Scheduled(cron = "0 10 23 ? * 1-5")
    public void getCashFlow(){
        CashFlowParams params = CashFlowParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.cashflow_vip(params);
    }

    @Scheduled(cron = "0 11 23 ? * 1-5")
    public void getForecast(){
        ForecastParams params = ForecastParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.forecast_vip(params);
    }

    @Scheduled(cron = "0 12 23 ? * 1-5")
    public void getExpress(){
        ExpressParams params = ExpressParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.express_vip(params);
    }

    @Scheduled(cron = "0 13 23 ? * 1-5")
    public void getDivideng(){
        DividendParams params = DividendParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.dividend(params);
    }

    @Scheduled(cron = "0 14 23 ? * 1-5")
    public void getFinaIndicator(){
        FinaIndicatorParams params = FinaIndicatorParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.fina_indicator_vip(params);
    }

    @Scheduled(cron = "0 15 23 ? * 1-5")
    public void getFinaAudit(){
        FinaAuditParams params = FinaAuditParams.builder().ann_date(DataFormat.NowDay()).build();
        financialDataService.fina_audit(params);
    }

    @Scheduled(cron = "0 16 23 ? * 1-5")
    public void getFinaMainBz(){
        FinaMainbzParams params = FinaMainbzParams.builder().period(DataFormat.Report()).build();
        financialDataService.fina_mainbz_vip(params);
    }

    @Scheduled(cron = "0 17 23 ? * 1-5")
    public void getDisclosure(){
        DisclosureDateParams params = DisclosureDateParams.builder().end_date(DataFormat.NextReport()).build();
        financialDataService.disclosure_date(params);
    }

    /**
     *参考数据
     */
    @Scheduled(cron = "0 24 9 ? * *")
    public void getMargin(){
        MarginParams params = MarginParams.builder().trade_date(DataFormat.YesterDay()).build();
        referenceDataService.margin(params);
    }

    @Scheduled(cron = "10 24 9 ? * *")
    public void getMarginDetail(){
        MarginDetailParams params = MarginDetailParams.builder().trade_date(DataFormat.YesterDay()).build();
        referenceDataService.margin_detail(params);
    }

    @Scheduled(cron = "0 0 9 ? * *")
    public void getMarginTarget(){
        MarginTargetParams params = MarginTargetParams.builder().build();
        referenceDataService.margin_target(params);
    }

    @Scheduled(cron = "0 0 22 ? * *")
    public void getTopList(){
        TopListParams params = TopListParams.builder().trade_date(DataFormat.NowDay()).build();
        referenceDataService.top_list(params);
    }

    @Scheduled(cron = "0 30 22 ? * *")
    public void getTopInst(){
        TopInstParams params = TopInstParams.builder().trade_date(DataFormat.NowDay()).build();
        referenceDataService.top_inst(params);
    }

    @Scheduled(cron = "0 31 22 ? * *")
    public void getPledge(){
        PledgeStatParams params = PledgeStatParams.builder().end_date(DataFormat.NowDay()).build();
        referenceDataService.pledge_stat(params);
    }

    @Scheduled(cron = "0 30 23 ? * *")
    public void getRepurchase(){
        RepurchaseParams params = RepurchaseParams.builder().ann_date(DataFormat.NowDay()).build();
        referenceDataService.repurchase(params);
    }

    @Scheduled(cron = "0 35 22 ? * *")
    public void getConcept(){
        ConceptParams build = ConceptParams.builder().build();
        referenceDataService.concept(build);
    }

    @Scheduled(cron = "0 36 22 ? * *")
    private void getShareFloat(){
        ShareFloatParams params = ShareFloatParams.builder().ann_date(DataFormat.NowDay()).build();
        referenceDataService.share_float(params);
    }

    @Scheduled(cron = "0 37 22 ? * *")
    public void getBlockTrade(){
        BlockTradeParams params = BlockTradeParams.builder().trade_date(DataFormat.NowDay()).build();
        referenceDataService.block_trade(params);
    }

    @Scheduled(cron = "0 38 22 ? * *")
    public void getStkHoldernumber(){
        StkHoldernumberParams params = StkHoldernumberParams.builder().enddate(DataFormat.NowDay()).build();
        referenceDataService.stk_holdernumber(params);
    }

    @Scheduled(cron = "0 39 22 ? * *")
    public void getStkHoldertrade(){
        StkHoldertradeParams build = StkHoldertradeParams.builder().ann_date(DataFormat.NowDay()).build();
        referenceDataService.stk_holdertrade(build);
    }

    /**
     * 特色数据
     */
    @Scheduled(cron = "0 10 22 ? * 1-5")
    public void report_rc(){
        ReportRcParams build = ReportRcParams.builder().report_date(DataFormat.NowDay()).build();
        characteristicDataService.report_rc(build);
    }

    @Scheduled(cron = "0 10 19 ? * 1-5")
    public void cyq_perf(){
        CyqPerfParams build = CyqPerfParams.builder().trade_date(DataFormat.NowDay()).build();
        characteristicDataService.cyq_perf(build);
    }

    @Scheduled(cron = "0 30 23 ? * 1-5")
    public void  stk_factor(){
        StkFactorParams build = StkFactorParams.builder().trade_date(DataFormat.NowDay()).build();
        characteristicDataService.stk_factor(build);
    }

    @Scheduled(cron = "10 10 9 ? * *")
    public void ccass_hold(){
        CcassHoldParams build = CcassHoldParams.builder().trade_date(DataFormat.YesterDay()).build();
        characteristicDataService.ccass_hold(build);
    }

    @Scheduled(cron = "11 10 9 ? * *")
    public void ccass_hold_detail(){
        CcassHoldDetailParams build = CcassHoldDetailParams.builder().trade_date(DataFormat.YesterDay()).build();
        characteristicDataService.ccass_hold_detail(build);
    }

    @Scheduled(cron = "10 10 10 ? * *")
    public void hk_hold(){
        HkHoldParams sh = HkHoldParams.builder().trade_date(DataFormat.YesterDay()).exchange("SH").build();
        HkHoldParams sz = HkHoldParams.builder().trade_date(DataFormat.YesterDay()).exchange("SZ").build();
        HkHoldParams hk = HkHoldParams.builder().trade_date(DataFormat.YesterDay()).exchange("HK").build();
        characteristicDataService.hk_hold(sh);
        characteristicDataService.hk_hold(sz);
        characteristicDataService.hk_hold(hk);
    }

    @Scheduled(cron = "20 20 23 ? * 1-5")
    public void limit_list_d(){
        LimitListDParams sh = LimitListDParams.builder().trade_date(DataFormat.NowDay()).exchange("SH").build();
        LimitListDParams sz = LimitListDParams.builder().trade_date(DataFormat.NowDay()).exchange("SZ").build();
        LimitListDParams bj = LimitListDParams.builder().trade_date(DataFormat.NowDay()).exchange("BJ").build();
        characteristicDataService.limit_list_d(sh);
        characteristicDataService.limit_list_d(sz);
        characteristicDataService.limit_list_d(bj);
    }

    @Scheduled(cron = "0 0 10 ? * *")
    public void stk_surv(){
        StkSurvParams build = StkSurvParams.builder().trade_date(DataFormat.NowDay()).build();
        characteristicDataService.stk_surv(build);
    }

    @Scheduled(cron = "0 0 9 ? * *")
    public void broker_recommend(){
        BrokerRecommendParams build = BrokerRecommendParams.builder().month(DataFormat.NowMonth()).build();
        characteristicDataService.broker_recommend(build);
    }
}
