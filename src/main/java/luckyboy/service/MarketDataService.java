package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "行情数据",tags = "行情数据")
@RestController
@RequestMapping(value = "/data/market",method = RequestMethod.GET)
public interface MarketDataService {

    @ApiOperation("A股日线行情")
    @RequestMapping("/daily")
    Result<?> daily(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("周线行情")
    @RequestMapping("/weekly")
    Result<?> weekly(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("月线行情")
    @RequestMapping("/monthly")
    Result<?> monthly(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);


    @ApiOperation("复权因子")
    @RequestMapping("/adj_factor")
    Result<?> adjFactor(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("每日停复牌信息")
    @RequestMapping("/suspend_d")
    Result<?> suspendD(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("每日指标")
    @RequestMapping("/daily_basic")
    Result<?> daily_basic(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("个股资金流向")
    @RequestMapping("/moneyflow")
    Result<?> moneyflow(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("每日涨跌停价格")
    @RequestMapping("/stk_limit")
    Result<?> stkLimit(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("沪深港通资金流向")
        @RequestMapping("/moneyflow_hsgt")
    Result<?> moneyflowHsgt(@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("沪深股通十大成交股")
    @RequestMapping("/hsgt_top10")
    Result<?> hsgtTop10(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("港股通十大成交股")
    @RequestMapping("/ggt_top10")
    Result<?> ggtTop10(@Param("ts_code") String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("港股通每日成交统计")
    @RequestMapping("/ggt_daily")
    Result<?> ggtDaily(@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("港股通每月成交统计")
    @RequestMapping("/ggt_monthly")
    Result<?> ggtMonthly(@Param("month")String month,@Param("start_month")String start_month,@Param("end_month")String end_month);

}
