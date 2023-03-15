package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.hsStock.*;
import luckyboy.util.Result;

@Api(value = "特色数据",tags = "特色数据")
public interface CharacteristicDataService {
    @ApiOperation("卖方盈利预测数据")
    Result<?> report_rc(ReportRcParams params);

    @ApiOperation("每日筹码及胜率")
    Result<?> cyq_perf(CyqPerfParams params);

    @ApiOperation("每日筹码分布")
    Result<?> cyq_chips(CyqChipsParams params);

    @ApiOperation("股票技术因子（量化因子）")
    Result<?> stk_factor(StkFactorParams params);

    @ApiOperation("中央结算系统持股汇总")
    Result<?> ccass_hold(CcassHoldParams params);

    @ApiOperation("中央结算系统持股明细")
    Result<?> ccass_hold_detail(CcassHoldDetailParams params);

    @ApiOperation("沪深港股通持股明细")
    Result<?> hk_hold(HkHoldParams params);

    @ApiOperation("涨跌停列表")
    Result<?> limit_list_d(LimitListDParams params);

    @ApiOperation("机构调研表")
    Result<?> stk_surv(StkSurvParams params);

    @ApiOperation("券商每月荐股")
    Result<?> broker_recommend(BrokerRecommendParams params);
}
