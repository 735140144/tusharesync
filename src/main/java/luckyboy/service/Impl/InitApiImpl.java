package luckyboy.service.Impl;

import luckyboy.api.InitApi;
import luckyboy.params.fund.*;
import luckyboy.params.fut.FutBasicParams;
import luckyboy.params.fut.FutDailyParams;
import luckyboy.params.fut.FutHoldingParams;
import luckyboy.params.fut.FutTradeCalParams;
import luckyboy.params.hsStock.*;
import luckyboy.params.index.*;
import luckyboy.params.sge.SgeBasicParams;
import luckyboy.params.sge.SgeDailyParams;
import luckyboy.result.fund.FundBasicResult;
import luckyboy.result.fut.FutBasicResult;
import luckyboy.result.hsStock.StockBasicResult;
import luckyboy.result.index.IndexBasicResult;
import luckyboy.result.index.ThsIndexResult;
import luckyboy.service.*;
import luckyboy.util.InitSqlUtil;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InitApiImpl implements InitApi {
    @Value("${shareDb.db}")
    private String db;

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

    @Autowired
    private IndexDataService indexDataService;

    @Autowired
    private FundDataService fundDataService;

    @Autowired
    private FutDataService futDataService;

    @Autowired
    private SgeDataService sgeDataService;

    @Override
    public Result<?> initSql(String dbtype) {
        String result = "";
        try {
            switch (dbtype) {
                case "mysql":
                    InitSqlUtil.initMysql(db);
                    result = "初始化mysql成功";
                    break;
                case "doris":
                    InitSqlUtil.initDoirs(db);
                    result = "初始化doris成功";
                    break;
                default:
                    result = "未寻找到匹配的数据库类型";
                    break;
            }
            return Result.ok(result);
        } catch (Exception e) {
            return Result.fail("初始化失败");
        }
    }

    @Override
    public Result<?> initData() {
        marketDataService.moneyflowHsgt(MoneyFlowHsgtParams.builder().build());
        marketDataService.hsgtTop10(HsgtTop10Params.builder().build());
        marketDataService.ggtTop10(GgtTop10Params.builder().build());
        marketDataService.ggtDaily(GgtDailyParams.builder().build());
        marketDataService.ggtMonthly(GgtMonthlyParams.builder().build());
        referenceDataService.margin(MarginParams.builder().build());
        referenceDataService.top_list(TopListParams.builder().build());
        referenceDataService.repurchase(RepurchaseParams.builder().build());
        referenceDataService.concept(ConceptParams.builder().build());
        List<StockBasicResult> allStock = basicDataService.getAllStock();
        for (StockBasicResult stockBasicResult : allStock) {
            basicDataService.NameChange(NameChangeParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            basicDataService.StkManagers(StkManagersParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            basicDataService.StkRewards(StkRewardsParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.daily(DailyWeeklyMonthlyParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.weekly(DailyWeeklyMonthlyParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.monthly(DailyWeeklyMonthlyParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.adjFactor(AdjFactorParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.suspendD(SuspendDParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.daily_basic(DailyBasicParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.moneyflow(MoneyFlowParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            marketDataService.stkLimit(StkLimitParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.income_vip(InComeParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.balancesheet_vip(BalanceSheetParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.cashflow_vip(CashFlowParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.forecast_vip(ForecastParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.express_vip(ExpressParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.dividend(DividendParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.fina_indicator_vip(FinaIndicatorParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.fina_audit(FinaAuditParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.fina_mainbz_vip(FinaMainbzParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            financialDataService.disclosure_date(DisclosureDateParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.margin_detail(MarginDetailParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.margin_target(MarginTargetParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.top10_holders(Top10HoldersParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.top10_floatholders(Top10FloatholdersParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.pledge_stat(PledgeStatParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.pledge_detail(PledgeDetailParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.share_float(ShareFloatParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.block_trade(BlockTradeParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.stk_holdernumber(StkHoldernumberParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            referenceDataService.stk_holdertrade(StkHoldertradeParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            characteristicDataService.report_rc(ReportRcParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            characteristicDataService.cyq_chips(CyqChipsParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            characteristicDataService.cyq_chips(CyqChipsParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            characteristicDataService.stk_factor(StkFactorParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            characteristicDataService.ccass_hold(CcassHoldParams.builder().ts_code(stockBasicResult.getTs_code()).build());
            characteristicDataService.stk_surv(StkSurvParams.builder().ts_code(stockBasicResult.getTs_code()).build());
        }
        indexDataService.index_basic(IndexBasicParams.builder().build());
        indexDataService.index_dailybasic(IndexDailybasicParams.builder().build());
        indexDataService.index_classify(IndexClassifyParams.builder().build());
        indexDataService.index_member(IndexMemberParams.builder().build());
        indexDataService.daily_info(DailyInfoParams.builder().build());
        indexDataService.sz_daily_info(SzDailyInfoParams.builder().build());
        indexDataService.ths_index(ThsIndexParams.builder().build());
        List<IndexBasicResult> allIndex = indexDataService.getAllIndex();
        for (IndexBasicResult index : allIndex) {
            indexDataService.index_daily(IndexDailyParams.builder().ts_code(index.getTs_code()).build());
            indexDataService.index_weekly(IndexWeeklyParams.builder().ts_code(index.getTs_code()).build());
            indexDataService.index_monthly(IndexMonthlyParams.builder().ts_code(index.getTs_code()).build());
            indexDataService.index_weight(IndexWeightParams.builder().index_code(index.getTs_code()).build());
        }
        List<ThsIndexResult> allThs = indexDataService.getAllThs();
        for (ThsIndexResult allTh : allThs) {
            indexDataService.ths_daily(ThsDailyParams.builder().ts_code(allTh.getTs_code()).build());
            indexDataService.ths_member(ThsMemberParams.builder().ts_code(allTh.getTs_code()).build());
        }
        fundDataService.fund_basic(FundBasicParams.builder().build());
        fundDataService.fund_manager(FundManagerParams.builder().build());
        fundDataService.fund_company(FundCompanyParams.builder().build());
        fundDataService.fund_share(FundShareParams.builder().build());
        List<FundBasicResult> allfund = fundDataService.allfund();
        for (FundBasicResult fundBasicResult : allfund) {
            fundDataService.fund_nav(FundNavParams.builder().ts_code(fundBasicResult.getTs_code()).build());
            fundDataService.fund_div(FundDivParams.builder().ts_code(fundBasicResult.getTs_code()).build());
            fundDataService.fund_portfolio(FundPortfolioParams.builder().ts_code(fundBasicResult.getTs_code()).build());
            fundDataService.fund_daily(FundDailyParams.builder().ts_code(fundBasicResult.getTs_code()).build());
            fundDataService.fund_adj(FundAdjParams.builder().ts_code(fundBasicResult.getTs_code()).build());
        }
        futDataService.fut_basic(FutBasicParams.builder().build());
        futDataService.fut_trade_cal(FutTradeCalParams.builder().build());
        List<FutBasicResult> getall = futDataService.getall();
        for (FutBasicResult futBasicResult : getall) {
            futDataService.fut_daily(FutDailyParams.builder().ts_code(futBasicResult.getTs_code()).build());

        }
        sgeDataService.sge_basic(SgeBasicParams.builder().build());
        sgeDataService.sge_daily(SgeDailyParams.builder().build());

        return Result.ok("初始化完成！");
    }
}
