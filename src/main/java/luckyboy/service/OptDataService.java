package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.opt.OptBasicParams;
import luckyboy.params.opt.OptDailyParams;
import luckyboy.util.Result;

@Api(value = "期权数据",tags = "期权数据")
public interface OptDataService {

    @ApiOperation("期权合约信息")
    Result<?> opt_basic(OptBasicParams params);

    @ApiOperation("期权日线行情")
    Result<?> opt_daily(OptDailyParams params);
}
