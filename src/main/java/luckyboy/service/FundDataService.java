package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "基金数据",tags = "基金数据")
public interface FundDataService {
    @ApiOperation("公募基金列表")
    Result<?> fund_basic();

    @ApiOperation("公募基金公司")
    Result<?> fund_company();

    @ApiOperation("基金经理")
    Result<?> fund_manager();

    @ApiOperation("基金规模数据")
    Result<?> fund_share();

    @ApiOperation("公募基金净值")
    Result<?> fund_nav();

    @ApiOperation("公募基金分红")
    Result<?> fund_div();

    @ApiOperation("公募基金持仓数据")
    Result<?> fund_portfolio();

    @ApiOperation("场内基金日线行情")
    Result<?> fund_daily();


    @ApiOperation("基金复权因子")
    Result<?> fund_adj();
}
