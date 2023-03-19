package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.fut.*;
import luckyboy.util.Result;

@Api(value = "期货数据",tags = "期货数据")
public interface FutDataService {
    @ApiOperation("期货合约信息表")
    Result<?> fut_basic (FutBasicParams params);

    @ApiOperation("交易日历")
    Result<?> fut_trade_cal (FutTradeCalParams params);

    @ApiOperation("期货日线行情")
    Result<?> fut_daily (FutDailyParams params);

    @ApiOperation("每日成交持仓排名")
    Result<?> fut_holding (FutHoldingParams params);

    @ApiOperation("仓单日报")
    Result<?> fut_wsr (FutWsrParams params);

    @ApiOperation("结算参数")
    Result<?> fut_settle (FutSettleParams params);

    @ApiOperation("南华期货指数日线行情")
    Result<?> fut_index_daily (FutIndexDailyParams params);

    @ApiOperation("期货主力与连续合约")
    Result<?> fut_mapping (FutMappingParams params);

    @ApiOperation("期货主要品种交易周报")
    Result<?> fut_weekly_detail (FutWeeklyDetailParams params);

}
