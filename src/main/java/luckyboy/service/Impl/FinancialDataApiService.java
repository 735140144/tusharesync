package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.FinancialDataApi;
import luckyboy.params.*;
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
    public Result<?> income_vip() {
        InComeParams params = InComeParams.builder().build();
        return financialDataService.income_vip(params);
    }

    @Override
    public Result<?> balancesheet_vip() {
        BalanceSheetParams params = BalanceSheetParams.builder().build();
        return financialDataService.balancesheet_vip(params);
    }

    @Override
    public Result<?> cashflow_vip() {
        CashFlowParams params = CashFlowParams.builder().build();
        return financialDataService.cashflow_vip(params);
    }

    @Override
    public Result<?> forecast_vip() {
        ForecastParams params = ForecastParams.builder().build();
        return financialDataService.forecast_vip(params);
    }

    @Override
    public Result<?> express_vip() {
        ExpressParams params = ExpressParams.builder().build();
        return financialDataService.express_vip(params);
    }

    @Override
    public Result<?> dividend() {
        DividendParams params = DividendParams.builder().build();
        return financialDataService.dividend(params);
    }

    @Override
    public Result<?> fina_indicator_vip() {
        FinaIndicatorParams params = FinaIndicatorParams.builder().build();
        return financialDataService.fina_indicator_vip(params);
    }

    @Override
    public Result<?> fina_audit() {
        FinaAuditParams params = FinaAuditParams.builder().build();
        return financialDataService.fina_audit(params);
    }

    @Override
    public Result<?> fina_mainbz_vip() {
        FinaMainbzParams params = FinaMainbzParams.builder().build();
        return financialDataService.fina_mainbz_vip(params);
    }

    @Override
    public Result<?> disclosure_date() {
        DisclosureDateParams params = DisclosureDateParams.builder().build();
        return financialDataService.disclosure_date(params);
    }
}
