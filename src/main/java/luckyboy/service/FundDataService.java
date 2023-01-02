package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "基金数据",tags = "基金数据")
@RestController
@RequestMapping(value = "/data/fund",method = RequestMethod.GET)
public interface FundDataService {
    @ApiOperation("公募基金列表")
    @RequestMapping("/fund_basic")
    Result<?> fund_basic();

    @ApiOperation("公募基金公司")
    @RequestMapping("/fund_company")
    Result<?> fund_company();

    @ApiOperation("基金经理")
    @RequestMapping("/fund_manager")
    Result<?> fund_manager();

    @ApiOperation("基金规模数据")
    @RequestMapping("/fund_share")
    Result<?> fund_share();

    @ApiOperation("公募基金净值")
    @RequestMapping("/fund_nav")
    Result<?> fund_nav();

    @ApiOperation("公募基金分红")
    @RequestMapping("/fund_div")
    Result<?> fund_div();

    @ApiOperation("公募基金持仓数据")
    @RequestMapping("/fund_portfolio")
    Result<?> fund_portfolio();

    @ApiOperation("场内基金日线行情")
    @RequestMapping("/fund_daily")
    Result<?> fund_daily();


    @ApiOperation("基金复权因子")
    @RequestMapping("/fund_adj")
    Result<?> fund_adj();
}
