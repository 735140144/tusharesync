package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "基金数据",tags = "基金数据")
@RestController
@RequestMapping(value = "/data/fund",method = RequestMethod.GET)
public interface FundDataApi {
    @ApiOperation("公募基金列表")
    @RequestMapping("/fund_basic")
    Result<?> fund_basic(@Param("market")String market,@Param("status")String status);

    @ApiOperation("公募基金公司")
    @RequestMapping("/fund_company")
    Result<?> fund_company();

    @ApiOperation("基金经理")
    @RequestMapping("/fund_manager")
    Result<?> fund_manager(@Param("ts_code")String ts_code,@Param("ann_date")String ann_date,@Param("name")String name,@Param("offset")String offset,@Param("limit")String limit);

    @ApiOperation("基金规模数据")
    @RequestMapping("/fund_share")
    Result<?> fund_share(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("公募基金净值")
    @RequestMapping("/fund_nav")
    Result<?> fund_nav(@Param("ts_code")String ts_code,@Param("nav_date")String nav_date,@Param("market")String market,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("公募基金分红")
    @RequestMapping("/fund_div")
    Result<?> fund_div(@Param("ann_date")String ann_date,@Param("ex_date")String ex_date,@Param("pay_date")String pay_date,@Param("ts_code")String ts_code);

    @ApiOperation("公募基金持仓数据")
    @RequestMapping("/fund_portfolio")
    Result<?> fund_portfolio(@Param("ts_code")String ts_code,@Param("ann_date")String ann_date,@Param("start_date")String start_date,@Param("end_date")String end_date);

    @ApiOperation("场内基金日线行情")
    @RequestMapping("/fund_daily")
    Result<?> fund_daily(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);


    @ApiOperation("基金复权因子")
    @RequestMapping("/fund_adj")
    Result<?> fund_adj(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("offset")String offset,@Param("limit")String limit);
}
