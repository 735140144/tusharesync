package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.tmt.*;
import luckyboy.util.Result;

@Api(value = "TMT行业数据",tags = "TMT行业数据")
public interface TmtDataService {
	@ApiOperation("电影周度票房")
	Result<?> bo_weekly (BoWeeklyParams params);


	@ApiOperation("台湾电子产业月营收明细")
	Result<?> tmt_twincomedetail (TmtTwincomedetailParams params);


	@ApiOperation("电影日度票房")
	Result<?> bo_daily (BoDailyParams params);


	@ApiOperation("全国拍摄制作电视剧备案公示数据")
	Result<?> teleplay_record (TeleplayRecordParams params);


	@ApiOperation("电影月度票房")
	Result<?> bo_monthly (BoMonthlyParams params);


	@ApiOperation("全国电影剧本备案数据")
	Result<?> film_record (FilmRecordParams params);


	@ApiOperation("影院每日票房")
	Result<?> bo_cinema (BoCinemaParams params);


	@ApiOperation("台湾电子产业月营收")
	Result<?> tmt_twincome (TmtTwincomeParams params);


}