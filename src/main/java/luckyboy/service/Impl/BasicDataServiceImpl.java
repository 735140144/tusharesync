package luckyboy.service.Impl;

import luckyboy.params.StockBasicParams;
import luckyboy.service.BasicDataService;
import luckyboy.util.Result;

public class BasicDataServiceImpl implements BasicDataService {
    @Override
    public Result<?> StockBasic() {
        StockBasicParams build = StockBasicParams.builder().build();
        return null;
    }

    @Override
    public Result<?> TradeCal() {
        return null;
    }

    @Override
    public Result<?> NameChange() {
        return null;
    }

    @Override
    public Result<?> HsConst() {
        return null;
    }

    @Override
    public Result<?> StockCompany() {
        return null;
    }

    @Override
    public Result<?> StkManagers() {
        return null;
    }

    @Override
    public Result<?> StkRewards() {
        return null;
    }

    @Override
    public Result<?> NewShare() {
        return null;
    }
}
