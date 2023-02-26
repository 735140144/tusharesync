package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.*;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "市场参考数据",tags = "市场参考数据")
public interface ReferenceDataService {
    @ApiOperation("融资融券交易汇总")
    Result<?> margin(MarginParams params);

    @ApiOperation("融资融券交易明细")
    Result<?> margin_detail(MarginDetailParams params);

    @ApiOperation("融资融券标的")
    Result<?> margin_target(MarginTargetParams params);

    @ApiOperation("前十大股东")
    Result<?> top10_holders(Top10HoldersParams params);

    @ApiOperation("前十大流通股东")
    Result<?> top10_floatholders(Top10FloatholdersParams params);

    @ApiOperation("龙虎榜每日明细")
    Result<?> top_list(TopListParams params);

    @ApiOperation("龙虎榜机构明细")
    Result<?> top_inst(TopInstParams params);

    @ApiOperation("股权质押统计数据")
    Result<?> pledge_stat(PledgeStatParams params);

    @ApiOperation("股权质押明细")
    Result<?> pledge_detail(PledgeDetailParams params);

    @ApiOperation("股票回购")
    Result<?> repurchase(RepurchaseParams params);

    @ApiOperation("概念股分类")
    Result<?> concept(ConceptParams params);

    @ApiOperation("概念股列表")
    Result<?> concept_detail(ConceptDetailParams params);

    @ApiOperation("限售股解禁")
    Result<?> share_float(ShareFloatParams params);

    @ApiOperation("大宗交易")
    Result<?> block_trade(BlockTradeParams params);

    @ApiOperation("股东人数")
    Result<?> stk_holdernumber(StkHoldernumberParams params);

    @ApiOperation("股东增减持")
    Result<?> stk_holdertrade(StkHoldertradeParams params);

}
