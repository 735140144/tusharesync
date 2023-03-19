package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "债券数据",tags = "债券数据")
@RestController
@RequestMapping(value = "/data/cb",method = RequestMethod.GET)
public interface CbDataApi {

    @ApiOperation("大宗交易明细")
    @RequestMapping("/bond_blk_detail")
    Result<?> bond_blk_detail(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("债券回购日行情")
    @RequestMapping("/repo_daily")
    Result<?> repo_daily(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("可转债行情")
    @RequestMapping("/cb_daily")
    Result<?> cb_daily(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("可转债基本信息")
    @RequestMapping("/cb_basic")
    Result<?> cb_basic(@Param("ts_code") String ts_code,@Param("list_date") String list_date,@Param("exchange") String exchange);

    @ApiOperation("财经日历")
    @RequestMapping("/eco_cal")
    Result<?> eco_cal(@Param("date") String date,@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("currency") String currency,@Param("country") String country,@Param("event") String event);

    @ApiOperation("可转债发行")
    @RequestMapping("/cb_issue")
    Result<?> cb_issue(@Param("ts_code") String ts_code,@Param("ann_date") String ann_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("可转债转股结果")
    @RequestMapping("/cb_share")
    Result<?> cb_share(@Param("ts_code") String ts_code);

    @ApiOperation("债券大宗交易")
    @RequestMapping("/bond_blk")
    Result<?> bond_blk(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("可转债赎回信息")
    @RequestMapping("/cb_call")
    Result<?> cb_call(@Param("ts_code") String ts_code);

    @ApiOperation("可转债转股价变动")
    @RequestMapping("/cb_price_chg")
    Result<?> cb_price_chg(@Param("ts_code") String ts_code);

}