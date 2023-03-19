package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.cb.*;
import luckyboy.util.Result;

@Api(value = "债券数据",tags = "债券数据")
public interface CbDataService {
	@ApiOperation("大宗交易明细")
	Result<?> bond_blk_detail (BondBlkDetailParams params);


	@ApiOperation("债券回购日行情")
	Result<?> repo_daily (RepoDailyParams params);


	@ApiOperation("可转债行情")
	Result<?> cb_daily (CbDailyParams params);


	@ApiOperation("可转债基本信息")
	Result<?> cb_basic (CbBasicParams params);


	@ApiOperation("财经日历")
	Result<?> eco_cal (EcoCalParams params);


	@ApiOperation("可转债发行")
	Result<?> cb_issue (CbIssueParams params);


	@ApiOperation("可转债转股结果")
	Result<?> cb_share (CbShareParams params);


	@ApiOperation("债券大宗交易")
	Result<?> bond_blk (BondBlkParams params);


	@ApiOperation("可转债赎回信息")
	Result<?> cb_call (CbCallParams params);


	@ApiOperation("可转债转股价变动")
	Result<?> cb_price_chg (CbPriceChgParams params);


}