package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "指数数据",tags = "指数数据")
@RestController
@RequestMapping(value = "/data/index",method = RequestMethod.GET)
public interface IndexDataApi {
    @ApiOperation("指数基本信息")
    @RequestMapping("/index_basic")
    Result<?> index_basic(@Param("ts_code")String ts_code,@Param("name")String name,@Param("market")String market,@Param("publisher")String publisher,@Param("category")String category);

    @ApiOperation("指数日线行情")
    @RequestMapping("/index_daily")
    Result<?> index_daily(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("指数周线行情")
    @RequestMapping("/index_weekly")
    Result<?> index_weekly(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("指数月线行情")
    @RequestMapping("/index_monthly")
    Result<?> index_monthly(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("指数成分和权重")
    @RequestMapping("/index_weight")
    Result<?> index_weight(@Param("index_code")String index_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("大盘指数每日指标")
    @RequestMapping("/index_dailybasic")
    Result<?> index_dailybasic(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("申万行业分类")
    @RequestMapping("/index_classify")
    Result<?> index_classify(@Param("index_code")String index_code,@Param("level")String level,@Param("parent_code")String parent_code,@Param("src")String src);

    @ApiOperation("申万行业成分构成")
    @RequestMapping("/index_member")
    Result<?> index_member(@Param("index_code")String index_code,@Param("ts_code")String ts_code,@Param("is_new")String is_new);

    @ApiOperation("市场交易统计")
    @RequestMapping("/daily_info")
    Result<?> daily_info(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("exchange")String exchange,@Param("fields")String fields);

    @ApiOperation("深圳市场每日交易概况")
    @RequestMapping("/sz_daily_info")
    Result<?> sz_daily_info(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("同花顺概念和行业指数")
    @RequestMapping("/ths_index")
    Result<?> ths_index(@Param("ts_code")String ts_code,@Param("exchange")String exchange,@Param("type")String type);

    @ApiOperation("查询所有同花顺概念")
    @RequestMapping("/getAllIndex")
    Result<?>getAllThsIndex();

    @ApiOperation("同花顺板块指数行情")
    @RequestMapping("/ths_daily")
    Result<?> ths_daily(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("同花顺概念板块成分")
    @RequestMapping("/ths_member")
    Result<?> ths_member(@Param("ts_code")String ts_code,@Param("code")String code);

    @ApiOperation("国际指数")
    @RequestMapping("/index_global")
    Result<?> index_global(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);
}
