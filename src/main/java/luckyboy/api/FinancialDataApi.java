package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "财务数据",tags = "财务数据")
@RestController
@RequestMapping(value = "/data/financial",method = RequestMethod.GET)
public interface FinancialDataApi {
    @ApiOperation("利润表")
    @RequestMapping("/income_vip")
    Result<?> income_vip();

    @ApiOperation("资产负债表")
    @RequestMapping("/balancesheet_vip")
    Result<?> balancesheet_vip();

    @ApiOperation("现金流量表")
    @RequestMapping("/cashflow_vip")
    Result<?> cashflow_vip();

    @ApiOperation("业绩预告")
    @RequestMapping("/forecast_vip")
    Result<?> forecast_vip();

    @ApiOperation("业绩快报")
    @RequestMapping("/express_vip")
    Result<?> express_vip();

    @ApiOperation("分红送股")
    @RequestMapping("/dividend")
    Result<?> dividend();

    @ApiOperation("财务指标数据")
    @RequestMapping("/fina_indicator_vip")
    Result<?> fina_indicator_vip();

    @ApiOperation("财务审计意见")
    @RequestMapping("/fina_audit")
    Result<?> fina_audit();

    @ApiOperation("主营业务构成")
    @RequestMapping("/fina_mainbz_vip")
    Result<?> fina_mainbz_vip();

    @ApiOperation("财报披露计划")
    @RequestMapping("/disclosure_date")
    Result<?> disclosure_date();
}
