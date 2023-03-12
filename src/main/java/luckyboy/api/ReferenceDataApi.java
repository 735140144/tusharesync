package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "市场参考数据", tags = "市场参考数据")
@RestController
@RequestMapping(value = "/data/reference", method = RequestMethod.GET)
public interface ReferenceDataApi {
    @ApiOperation("融资融券交易汇总")
    @RequestMapping("/margin")
    Result<?> margin(@Param("trade_date") String trade_date, @Param("exchange_id") String exchange_id, @Param("start_date") String start_date, @Param("end_date") String end_date);

    @ApiOperation("融资融券交易明细")
    @RequestMapping("/margin_detail")
    Result<?> margin_detail(@Param("trade_date") String trade_date, @Param("ts_code") String ts_code, @Param("start_date") String start_date, @Param("end_date") String end_date);

    @ApiOperation("融资融券标的")
    @RequestMapping("/margin_target")
    Result<?> margin_target(@Param("ts_code") String ts_code, @Param("is_new") String is_new, @Param("mg_type") String mg_type);

    @ApiOperation("前十大股东")
    @RequestMapping("/top10_holders")
    Result<?> top10_holders(@Param("ts_code") String ts_code, @Param("period") String period, @Param("ann_date") String ann_date, @Param("start_date") String start_date, @Param("end_date") String end_date);

    @ApiOperation("前十大流通股东")
    @RequestMapping("/top10_floatholders")
    Result<?> top10_floatholders(@Param("ts_code") String ts_code, @Param("period") String period, @Param("ann_date") String ann_date, @Param("start_date") String start_date, @Param("end_date") String end_date);

    @ApiOperation("龙虎榜每日明细")
    @RequestMapping("/top_list")
    Result<?> top_list(@Param("trade_date")String trade_date,@Param("ts_code")String ts_code);

    @ApiOperation("龙虎榜机构明细")
    @RequestMapping("/top_inst")
    Result<?> top_inst(@Param("trade_date")String trade_date,@Param("ts_code")String ts_code);

    @ApiOperation("股权质押统计数据")
    @RequestMapping("pledge_stat")
    Result<?> pledge_stat(@Param("end_date")String end_date,@Param("ts_code")String ts_code);

    @ApiOperation("股权质押明细")
    @RequestMapping("/pledge_detail")
    Result<?> pledge_detail(@Param("ts_code")String ts_code);

    @ApiOperation("股票回购")
    @RequestMapping("/repurchase")
    Result<?> repurchase(@Param("ann_date")String ann_date,@Param("start_date") String start_date, @Param("end_date") String end_date);

    @ApiOperation("概念股分类")
    @RequestMapping("/concept")
    Result<?> concept(@Param("src")String src);

    @ApiOperation("概念股列表")
    @RequestMapping("/concept_detail")
    Result<?> concept_detail(@Param("id")String id,@Param("ts_code")String ts_code);

    @ApiOperation("限售股解禁")
    @RequestMapping("/share_float")
    Result<?> share_float(@Param("ts_code")String ts_code,@Param("ann_date")String ann_date,@Param("float_date")String float_date,@Param("start_date") String start_date,@Param("end_date")String end_date);

    @ApiOperation("大宗交易")
    @RequestMapping("/block_trade")
    Result<?> block_trade(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("股东人数")
    @RequestMapping("/stk_holdernumber")
    Result<?> stk_holdernumber(@Param("ts_code")String ts_code,@Param("enddate")String enddate,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("股东增减持")
    @RequestMapping("/stk_holdertrade")
    Result<?> stk_holdertrade(@Param("ts_code")String ts_code,@Param("ann_date") String ann_date,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("trade_type")String trade_type,@Param("holder_type") String holder_type);
}
