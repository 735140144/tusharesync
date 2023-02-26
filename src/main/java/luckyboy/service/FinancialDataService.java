package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.*;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "财务数据",tags = "财务数据")
public interface FinancialDataService {

    @ApiOperation("利润表")
    Result<?> income_vip(InComeParams params);

    @ApiOperation("资产负债表")
    Result<?> balancesheet_vip(BalanceSheetParams params);

    @ApiOperation("现金流量表")
    Result<?> cashflow_vip(CashFlowParams params);

    @ApiOperation("业绩预告")
    Result<?> forecast_vip(ForecastParams params);

    @ApiOperation("业绩快报")
    Result<?> express_vip(ExpressParams params);

    @ApiOperation("分红送股")
    Result<?> dividend(DividendParams params);

    @ApiOperation("财务指标数据")
    Result<?> fina_indicator_vip(FinaIndicatorParams params);

    @ApiOperation("财务审计意见")
    Result<?> fina_audit(FinaAuditParams params);

    @ApiOperation("主营业务构成")
    Result<?> fina_mainbz_vip(FinaMainbzParams params);

    @ApiOperation("财报披露计划")
    Result<?> disclosure_date(DisclosureDateParams params);


}
