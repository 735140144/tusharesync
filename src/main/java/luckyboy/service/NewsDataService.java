package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.news.*;
import luckyboy.util.Result;

@Api(value = "",tags = "")
public interface NewsDataService {
	@ApiOperation("新闻快讯")
	Result<?> news (NewsParams params);


	@ApiOperation("新闻联播")
	Result<?> cctv_news (CctvNewsParams params);


}