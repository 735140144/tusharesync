package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "特色数据",tags = "特色数据")
@RestController
@RequestMapping(value = "/data/characteristic",method = RequestMethod.GET)
public interface CharacteristicDataApi {
    @ApiOperation("卖方盈利预测数据")
    @RequestMapping("/report_rc")
    Result<?> report_rc(@Param("ts_code")String ts_code,@Param("report_date")String report_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("每日筹码及胜率")
    @RequestMapping("/cyq_perf")
    Result<?> cyq_perf(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("每日筹码分布")
    @RequestMapping("/cyq_chips")
    Result<?> cyq_chips(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("股票技术因子（量化因子）")
    @RequestMapping("/stk_factor")
    Result<?> stk_factor(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("中央结算系统持股汇总")
    @RequestMapping("/ccass_hold")
    Result<?> ccass_hold(@Param("ts_code")String ts_code,@Param("hk_code")String hk_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("中央结算系统持股明细")
    @RequestMapping("/ccass_hold_detail")
    Result<?> ccass_hold_detail(@Param("ts_code")String ts_code,@Param("hk_code")String hk_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("沪深港股通持股明细")
    @RequestMapping("/hk_hold")
    Result<?> hk_hold(@Param("code") String code,@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("exchange")String exchange);

    @ApiOperation("涨跌停列表")
    @RequestMapping("/limit_list_d")
    Result<?> limit_list_d(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("limit_type")String limit_type,@Param("exchange")String exchange,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("机构调研表")
    @RequestMapping("/stk_surv")
    Result<?> stk_surv(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("券商每月荐股")
    @RequestMapping("/broker_recommend")
    Result<?> broker_recommend(@Param("month")String month);
}
