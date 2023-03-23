package luckyboy.service.Impl;

import luckyboy.api.BasicDataApi;
import luckyboy.params.hsStock.*;
import luckyboy.service.BasicDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicDataApiService implements BasicDataApi {
    @Autowired
    private BasicDataService basicDataService;

    @Override
    public Result<?> StockBasic() {
        StockBasicParams build = StockBasicParams.builder().build();
        return basicDataService.StockBasic(build);
    }

    @Override
    public Result<?> TradeCal(String start, String end) {
        TradeCalParams build = TradeCalParams.builder().start_date(start).end_date(end).build();
        return basicDataService.TradeCal(build);
    }

    @Override
    public Result<?> NameChange(String ts_code, String start, String end) {
        NameChangeParams build = NameChangeParams.builder().ts_code(ts_code).start_date(start).end_date(end).build();
        return basicDataService.NameChange(build);
    }

    @Override
    public Result<?> HsConst(String hs_type) {
        HsConstParams build = HsConstParams.builder().hs_type(hs_type).build();
        return basicDataService.HsConst(build);
    }

    @Override
    public Result<?> StockCompany(String exchange) {
        StockCompanyParams build = StockCompanyParams.builder().exchange(exchange).build();
        return basicDataService.StockCompany(build);
    }

    @Override
    public Result<?> StkManagers(String ts_code, String start) {
        StkManagersParams build = StkManagersParams.builder().ts_code(ts_code).start_date(start).build();
        return basicDataService.StkManagers(build);
    }

    @Override
    public Result<?> StkRewards(String ts_code, String ann_date) {
        StkRewardsParams build = StkRewardsParams.builder().ts_code(ts_code).ann_date(ann_date).build();
        return basicDataService.StkRewards(build);
    }

    @Override
    public Result<?> NewShare(String start, String end) {
        NewShareParams build = NewShareParams.builder().start_date(start).end_date(end).build();
        return basicDataService.NewShare(build);
    }
}
