package luckyboy.service;

import io.swagger.annotations.Api;
import luckyboy.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "基础数据")
@RestController
@RequestMapping("/data/basic")
public interface BasicDataService {

    @RequestMapping("/stock")
    Result<?> StockBasic();

    @RequestMapping("/trade_date")
    Result<?> TradeCal();

    @RequestMapping("/namechange")
    Result<?> NameChange();

    @RequestMapping("/hs_const")
    Result<?> HsConst();

    @RequestMapping("/stock_company")
    Result<?> StockCompany();

    @RequestMapping("/stk_managers")
    Result<?> StkManagers();

    @RequestMapping("/stk_rewards")
    Result<?> StkRewards();

    @RequestMapping("/new_share")
    Result<?> NewShare();
}
