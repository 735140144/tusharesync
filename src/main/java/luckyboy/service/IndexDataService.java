package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.index.*;
import luckyboy.result.index.ThsIndexResult;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "指数数据",tags = "指数数据")
@RestController
public interface IndexDataService {

    @ApiOperation("指数基本信息")
    Result<?> index_basic(IndexBasicParams params);

    @ApiOperation("指数日线行情")
    Result<?> index_daily(IndexDailyParams params);

    @ApiOperation("指数周线行情")
    Result<?> index_weekly(IndexWeeklyParams params);

    @ApiOperation("指数月线行情")
    Result<?> index_monthly(IndexMonthlyParams params);

    @ApiOperation("指数成分和权重")
    Result<?> index_weight(IndexWeightParams params);

    @ApiOperation("大盘指数每日指标")
    Result<?> index_dailybasic(IndexDailybasicParams params);

    @ApiOperation("申万行业分类")
    Result<?> index_classify(IndexClassifyParams params);

    @ApiOperation("申万行业成分构成")
    Result<?> index_member(IndexMemberParams params);

    @ApiOperation("市场交易统计")
    Result<?> daily_info(DailyInfoParams params);

    @ApiOperation("深圳市场每日交易概况")
    Result<?> sz_daily_info(SzDailyInfoParams params);

    @ApiOperation("同花顺概念和行业指数")
    Result<?> ths_index(ThsIndexParams params);

    @ApiOperation("同花顺板块指数行情")
    Result<?> ths_daily(ThsDailyParams params);

    @ApiOperation("同花顺概念板块成分")
    Result<?> ths_member(ThsMemberParams params);

    @ApiOperation("国际指数")
    Result<?> index_global(IndexGlobalParams params);

    @ApiOperation("获取所有同花顺概念")
    List<ThsIndexResult> getAllThs();
}
