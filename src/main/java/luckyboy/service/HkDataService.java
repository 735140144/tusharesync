package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.hk.*;
import luckyboy.util.Result;

@Api(value = "港股数据",tags = "港股数据")
public interface HkDataService {
	@ApiOperation("港股列表")
	Result<?> hk_basic (HkBasicParams params);


	@ApiOperation("港股行情")
	Result<?> hk_daily (HkDailyParams params);


	@ApiOperation("港股交易日历")
	Result<?> hk_tradecal (HkTradecalParams params);


	@ApiOperation("港股分钟行情")
	Result<?> hk_mins (HkMinsParams params);


}