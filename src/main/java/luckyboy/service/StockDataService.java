package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.stock.*;
import luckyboy.util.Result;

@Api(value = "",tags = "")
public interface StockDataService {
	@ApiOperation("估值因子")
	Result<?> stock_vx (StockVxParams params);


	@ApiOperation("动能因子")
	Result<?> stock_mx (StockMxParams params);


}