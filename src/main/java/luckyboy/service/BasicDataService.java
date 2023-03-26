package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.hsStock.*;
import luckyboy.result.hsStock.StockBasicResult;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "基础数据",tags = "基础数据")
@RestController
public interface BasicDataService {

    @ApiOperation("股票列表")
    Result<?> StockBasic(StockBasicParams params);

    @ApiOperation("交易日历")
    Result<?> TradeCal(TradeCalParams params);

    @ApiOperation("股票曾用名")
    Result<?> NameChange(NameChangeParams params);

    @ApiOperation("沪深股通成份股")
    Result<?> HsConst(HsConstParams params);

    @ApiOperation("上市公司基本信息")
    Result<?> StockCompany(StockCompanyParams params);

    @ApiOperation("上市公司管理层")
    Result<?> StkManagers(StkManagersParams params);

    @ApiOperation("管理层薪酬和持股")
    Result<?> StkRewards(StkRewardsParams params);

    @ApiOperation("IPO新股列表")
    Result<?> NewShare(NewShareParams params);

    List<StockBasicResult> getAllStock();
}
