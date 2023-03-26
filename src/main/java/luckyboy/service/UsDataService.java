package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.us.*;
import luckyboy.util.Result;

@Api(value = "美股数据",tags = "美股数据")
public interface UsDataService {
	@ApiOperation("美股行情")
	Result<?> us_daily (UsDailyParams params);


	@ApiOperation("美股列表")
	Result<?> us_basic (UsBasicParams params);


	@ApiOperation("美股交易日历")
	Result<?> us_tradecal (UsTradecalParams params);


}