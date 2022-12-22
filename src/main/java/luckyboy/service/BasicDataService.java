package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.StockBasicParams;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "基础数据")
@RestController
@RequestMapping("/data/basic")
public interface BasicDataService {

    @ApiOperation("股票列表")
    @RequestMapping("/stock")
    Result<?> StockBasic();

    @ApiOperation("交易日历")
    @RequestMapping("/trade_date")
    Result<?> TradeCal(@Param("start") String start,@Param("end") String end);

    @ApiOperation("股票曾用名")
    @RequestMapping("/namechange")
    Result<?> NameChange(@Param("ts_code") String ts_code,@Param("start") String start,@Param("end") String end);

    @ApiOperation("沪深股通成份股")
    @RequestMapping("/hs_const")
    Result<?> HsConst(@Param("hs_type")String hs_type);

    @ApiOperation("上市公司基本信息")
    @RequestMapping("/stock_company")
    Result<?> StockCompany();

    @ApiOperation("上市公司管理层")
    @RequestMapping("/stk_managers")
    Result<?> StkManagers(@Param("ts_code") String ts_code,@Param("start") String start);

    @ApiOperation("管理层薪酬和持股")
    @RequestMapping("/stk_rewards")
    Result<?> StkRewards(@Param("ts_code") String ts_code,@Param("end_date") String end_date);

    @ApiOperation("IPO新股列表")
    @RequestMapping("/new_share")
    Result<?> NewShare(@Param("start") String start,@Param("end") String end);
}
