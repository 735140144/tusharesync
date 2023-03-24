package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.fund.*;
import luckyboy.result.fund.FundBasicResult;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "基金数据",tags = "基金数据")
public interface FundDataService {
    @ApiOperation("公募基金列表")
    Result<?> fund_basic(FundBasicParams params);

    @ApiOperation("公募基金公司")
    Result<?> fund_company(FundCompanyParams params);

    @ApiOperation("基金经理")
    Result<?> fund_manager(FundManagerParams params);

    @ApiOperation("基金规模数据")
    Result<?> fund_share(FundShareParams params);

    @ApiOperation("公募基金净值")
    Result<?> fund_nav(FundNavParams params);

    @ApiOperation("公募基金分红")
    Result<?> fund_div(FundDivParams params);

    @ApiOperation("公募基金持仓数据")
    Result<?> fund_portfolio(FundPortfolioParams params);

    @ApiOperation("场内基金日线行情")
    Result<?> fund_daily(FundDailyParams params);


    @ApiOperation("基金复权因子")
    Result<?> fund_adj(FundAdjParams params);

    List<FundBasicResult> allfund();
}
