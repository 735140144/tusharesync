package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "期货数据",tags = "期货数据")
@RestController
@RequestMapping(value = "/data/fut",method = RequestMethod.GET)
public interface FutDataApi {
    @ApiOperation("期货合约信息表")
    @RequestMapping("/fut_basic")
    Result<?> fut_basic (@Param("exchange")String exchange,@Param("fut_type")String fut_type);

    @ApiOperation("交易日历")
    @RequestMapping("/trade_cal")
    Result<?> fut_trade_cal (@Param("exchange")String exchange,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("is_open")String is_open);

    @ApiOperation("期货日线行情")
    @RequestMapping("/fut_daily")
    Result<?> fut_daily (@Param("trade_date")String trade_date,@Param("ts_code")String ts_code,@Param("exchange")String exchange,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("每日成交持仓排名")
    @RequestMapping("/fut_holding")
    Result<?> fut_holding (@Param("trade_date")String trade_date,@Param("symbol")String symbol,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("exchange")String exchange);

    @ApiOperation("仓单日报")
    @RequestMapping("/fut_wsr")
    Result<?> fut_wsr (@Param("trade_date")String trade_date,@Param("symbol")String symbol,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("exchange")String exchange);

    @ApiOperation("结算参数")
    @RequestMapping("/fut_settle")
    Result<?> fut_settle (@Param("trade_date")String trade_date,@Param("ts_code")String ts_code,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("exchange")String exchange);

    @ApiOperation("南华期货指数日线行情")
    @RequestMapping("/index_daily")
    Result<?> fut_index_daily (@Param("trade_date")String trade_date,@Param("ts_code")String ts_code,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("期货主力与连续合约")
    @RequestMapping("/fut_mapping")
    Result<?> fut_mapping (@Param("trade_date")String trade_date,@Param("ts_code")String ts_code,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("期货主要品种交易周报")
    @RequestMapping("/fut_weekly_detail")
    Result<?> fut_weekly_detail (@Param("week")String week,@Param("prd")String prd,@Param("start_week")String start_week,@Param("end_week")String end_week,@Param("exchange")String exchange,@Param("fields")String fields);
}
