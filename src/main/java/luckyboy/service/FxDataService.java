package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.fx.*;
import luckyboy.util.Result;

@Api(value = "外汇数据",tags = "外汇数据")
public interface FxDataService {
	@ApiOperation("外汇基础信息（海外）")
	Result<?> fx_obasic (FxObasicParams params);


	@ApiOperation("外汇日线行情")
	Result<?> fx_daily (FxDailyParams params);


}