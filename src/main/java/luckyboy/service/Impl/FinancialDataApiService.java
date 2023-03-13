package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.FinancialDataApi;
import luckyboy.params.hsStock.*;
import luckyboy.service.FinancialDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class FinancialDataApiService implements FinancialDataApi {
    @Autowired
    private FinancialDataService financialDataService;

    @Override
    public Result<?> income_vip(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        InComeParams params = InComeParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.income_vip(params);
    }

    @Override
    public Result<?> balancesheet_vip(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        BalanceSheetParams params = BalanceSheetParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.balancesheet_vip(params);
    }

    @Override
    public Result<?> cashflow_vip(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        CashFlowParams params = CashFlowParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.cashflow_vip(params);
    }

    @Override
    public Result<?> forecast_vip(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        ForecastParams params = ForecastParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.forecast_vip(params);
    }

    @Override
    public Result<?> express_vip(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        ExpressParams params = ExpressParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.express_vip(params);
    }

    @Override
    public Result<?> dividend( String ts_code,String ann_date,String ex_date) {
        DividendParams params = DividendParams.builder().ts_code(ts_code).ann_date(ann_date).ex_date(ex_date).build();
        return financialDataService.dividend(params);
    }

    @Override
    public Result<?> fina_indicator_vip(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        FinaIndicatorParams params = FinaIndicatorParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.fina_indicator_vip(params);
    }

    @Override
    public Result<?> fina_audit(String ts_code,  String ann_date,  String start_date,  String end_date,  String period) {
        FinaAuditParams params = FinaAuditParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.fina_audit(params);
    }

    @Override
    public Result<?> fina_mainbz_vip(String ts_code,  String type,  String start_date,  String end_date,  String period) {
        FinaMainbzParams params = FinaMainbzParams.builder().ts_code(ts_code).type(type).start_date(start_date).end_date(end_date).period(period).build();
        return financialDataService.fina_mainbz_vip(params);
    }

    @Override
    public Result<?> disclosure_date(String ts_code,String end_date,String pre_date,String actual_date) {
        DisclosureDateParams params = DisclosureDateParams.builder().ts_code(ts_code).end_date(end_date).pre_date(pre_date).actual_date(actual_date).build();
        return financialDataService.disclosure_date(params);
    }
}
