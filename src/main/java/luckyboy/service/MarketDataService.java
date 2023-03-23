package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.hsStock.*;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "行情数据",tags = "行情数据")
@RestController
public interface MarketDataService {

    @ApiOperation("A股日线行情")
    Result<?> daily(DailyWeeklyMonthlyParams params);

    @ApiOperation("周线行情")
    Result<?> weekly(DailyWeeklyMonthlyParams params);

    @ApiOperation("月线行情")
    Result<?> monthly(DailyWeeklyMonthlyParams params);


    @ApiOperation("复权因子")
    Result<?> adjFactor(AdjFactorParams params);

    @ApiOperation("每日停复牌信息")
    Result<?> suspendD(SuspendDParams params);

    @ApiOperation("每日指标")
    Result<?> daily_basic(DailyBasicParams params);

    @ApiOperation("个股资金流向")
    Result<?> moneyflow(MoneyFlowParams params);

    @ApiOperation("每日涨跌停价格")
    Result<?> stkLimit(StkLimitParams params);

    @ApiOperation("沪深港通资金流向")
    Result<?> moneyflowHsgt(MoneyFlowHsgtParams params);

    @ApiOperation("沪深股通十大成交股")
    Result<?> hsgtTop10(HsgtTop10Params params);

    @ApiOperation("港股通十大成交股")
    Result<?> ggtTop10(GgtTop10Params params);

    @ApiOperation("港股通每日成交统计")
    Result<?> ggtDaily(GgtDailyParams params);

    @ApiOperation("港股通每月成交统计")
    Result<?> ggtMonthly(GgtMonthlyParams params);
}
