package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "特色数据")
@RestController
@RequestMapping("/data/characteristic")
public interface CharacteristicDataService {
    @ApiOperation("卖方盈利预测数据")
    @RequestMapping("/report_rc")
    Result<?> report_rc();

    @ApiOperation("每日筹码及胜率")
    @RequestMapping("/cyq_perf")
    Result<?> cyq_perf();

    @ApiOperation("每日筹码分布")
    @RequestMapping("/cyq_chips")
    Result<?> cyq_chips();

    @ApiOperation("股票技术因子（量化因子）")
    @RequestMapping("/stk_factor")
    Result<?> stk_factor();

    @ApiOperation("中央结算系统持股汇总")
    @RequestMapping("/ccass_hold")
    Result<?> ccass_hold();

    @ApiOperation("中央结算系统持股明细")
    @RequestMapping("/ccass_hold_detail")
    Result<?> ccass_hold_detail();

    @ApiOperation("沪深港股通持股明细")
    @RequestMapping("/hk_hold")
    Result<?> hk_hold();

    @ApiOperation("涨跌停列表")
    @RequestMapping("/limit_list_d")
    Result<?> limit_list_d();

    @ApiOperation("机构调研表")
    @RequestMapping("/stk_surv")
    Result<?> stk_surv();

    @ApiOperation("券商每月荐股")
    @RequestMapping("/broker_recommend")
    Result<?> broker_recommend();
}
