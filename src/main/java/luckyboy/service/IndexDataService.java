package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "指数数据",tags = "指数数据")
@RestController
@RequestMapping(value = "/data/index",method = RequestMethod.GET)
public interface IndexDataService {

    @ApiOperation("指数基本信息")
    @RequestMapping("/index_basic")
    Result<?> index_basic();

    @ApiOperation("指数日线行情")
    @RequestMapping("/index_daily")
    Result<?> index_daily();

    @ApiOperation("指数周线行情")
    @RequestMapping("/index_weekly")
    Result<?> index_weekly();

    @ApiOperation("指数月线行情")
    @RequestMapping("/index_monthly")
    Result<?> index_monthly();

    @ApiOperation("指数成分和权重")
    @RequestMapping("/index_weight")
    Result<?> index_weight();

    @ApiOperation("大盘指数每日指标")
    @RequestMapping("/index_dailybasic")
    Result<?> index_dailybasic();

    @ApiOperation("申万行业分类")
    @RequestMapping("/index_classify")
    Result<?> index_classify();

    @ApiOperation("申万行业成分构成")
    @RequestMapping("/index_member")
    Result<?> index_member();

    @ApiOperation("市场交易统计")
    @RequestMapping("/daily_info")
    Result<?> daily_info();

    @ApiOperation("深圳市场每日交易概况")
    @RequestMapping("/sz_daily_info")
    Result<?> sz_daily_info();

    @ApiOperation("同花顺概念和行业指数")
    @RequestMapping("/ths_index")
    Result<?> ths_index();

    @ApiOperation("同花顺板块指数行情")
    @RequestMapping("/ths_daily")
    Result<?> ths_daily();

    @ApiOperation("同花顺概念板块成分")
    @RequestMapping("/ths_member")
    Result<?> ths_member();

    @ApiOperation("国际指数")
    @RequestMapping("/index_global")
    Result<?> index_global();
}
