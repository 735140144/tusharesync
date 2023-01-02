package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "市场参考数据",tags = "市场参考数据")
@RestController
@RequestMapping(value = "/data/reference",method = RequestMethod.GET)
public interface ReferenceDataService {
    @ApiOperation("融资融券交易汇总")
    @RequestMapping("/margin")
    Result<?> margin();

    @ApiOperation("融资融券交易明细")
    @RequestMapping("/margin_detail")
    Result<?> margin_detail();

    @ApiOperation("融资融券标的")
    @RequestMapping("/margin_target")
    Result<?> margin_target();

    @ApiOperation("前十大股东")
    @RequestMapping("/top10_holders")
    Result<?> top10_holders();

    @ApiOperation("前十大流通股东")
    @RequestMapping("/top10_floatholders")
    Result<?> top10_floatholders();

    @ApiOperation("龙虎榜每日明细")
    @RequestMapping("/top_list")
    Result<?> top_list();

    @ApiOperation("龙虎榜机构明细")
    @RequestMapping("/top_inst")
    Result<?> top_inst();

    @ApiOperation("股权质押统计数据")
    @RequestMapping("pledge_stat")
    Result<?> pledge_stat();

    @ApiOperation("股权质押明细")
    @RequestMapping("/pledge_detail")
    Result<?> pledge_detail();

    @ApiOperation("股票回购")
    @RequestMapping("/repurchase")
    Result<?> repurchase();

    @ApiOperation("概念股分类")
    @RequestMapping("/concept")
    Result<?> concept();

    @ApiOperation("概念股列表")
    @RequestMapping("/concept_detail")
    Result<?> concept_detail();

    @ApiOperation("限售股解禁")
    @RequestMapping("/share_float")
    Result<?> share_float();

    @ApiOperation("大宗交易")
    @RequestMapping("/block_trade")
    Result<?> block_trade();

    @ApiOperation("股东人数")
    @RequestMapping("/stk_holdernumber")
    Result<?> stk_holdernumber();

    @ApiOperation("股东增减持")
    @RequestMapping("/stk_holdertrade")
    Result<?> stk_holdertrade();

}
