package luckyboy.service;

import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "行情数据")
@RestController
@RequestMapping("/data/market")
public interface MarketDataService {

    @ApiOperation("A股日线行情")
    @RequestMapping("/daily")
    Result<?> daily();

    @ApiOperation("周线行情")
    @RequestMapping("/weekly")
    Result<?> weekly();

    @ApiOperation("月线行情")
    @RequestMapping("/monthly")
    Result<?> monthly();

    @ApiOperation("A股复权行情")
    @RequestMapping("/pro_bar")
    Result<?> proBar();

    @ApiOperation("复权因子")
    @RequestMapping("/adj_factor")
    Result<?> adjFactor();

    @ApiOperation("每日停复牌信息")
    @RequestMapping("/suspend_d")
    Result<?> suspendD();

    @ApiOperation("每日指标")
    @RequestMapping("/daily_basic")
    Result<?> daily_basic();

    @ApiOperation("个股资金流向")
    @RequestMapping("/moneyflow")
    Result<?> moneyflow();

    @ApiOperation("每日涨跌停价格")
    @RequestMapping("/stk_limit")
    Result<?> stkLimit();

    @ApiOperation("沪深港通资金流向")
    @RequestMapping("/moneyflow_hsgt")
    Result<?> moneyflowHsgt();

    @ApiOperation("沪深股通十大成交股")
    @RequestMapping("/hsgt_top10")
    Result<?> hsgtTop10();

    @ApiOperation("港股通十大成交股")
    @RequestMapping("/ggt_top10")
    Result<?> ggtTop10();

    @ApiOperation("港股通每日成交统计")
    @RequestMapping("/ggt_daily")
    Result<?> ggtDaily();

    @ApiOperation("港股通每月成交统计")
    @RequestMapping("/ggt_monthly")
    Result<?> ggtMonthly();

}
