package luckyboy.service;

import io.swagger.annotations.Api;
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

    @RequestMapping("/stock")
    Result<?> StockBasic();

    @RequestMapping("/trade_date")
    Result<?> TradeCal(@Param("start") String start,@Param("end") String end);

    @RequestMapping("/namechange")
    Result<?> NameChange(@Param("ts_code") String ts_code,@Param("start") String start,@Param("end") String end);

    @RequestMapping("/hs_const")
    Result<?> HsConst(@Param("hs_type")String hs_type);

    @RequestMapping("/stock_company")
    Result<?> StockCompany();

    @RequestMapping("/stk_managers")
    Result<?> StkManagers(@Param("ts_code") String ts_code,@Param("start") String start);

    @RequestMapping("/stk_rewards")
    Result<?> StkRewards(@Param("ts_code") String ts_code,@Param("end_date") String end_date);

    @RequestMapping("/new_share")
    Result<?> NewShare(@Param("start") String start,@Param("end") String end);
}
