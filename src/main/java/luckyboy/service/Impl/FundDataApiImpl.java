package luckyboy.service.Impl;

import luckyboy.api.FundDataApi;
import luckyboy.params.fund.*;
import luckyboy.service.FundDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundDataApiImpl implements FundDataApi {
    @Autowired
    private FundDataService fundDataService;

    @Override
    public Result<?> fund_basic(String market, String status) {
        FundBasicParams params = FundBasicParams.builder().market(market).status(status).build();
        return fundDataService.fund_basic(params);
    }

    @Override
    public Result<?> fund_company() {
        FundCompanyParams params = FundCompanyParams.builder().build();
        return fundDataService.fund_company(params);
    }

    @Override
    public Result<?> fund_manager(String ts_code, String ann_date, String name, String offset, String limit) {
        FundManagerParams params = FundManagerParams.builder().ts_code(ts_code).ann_date(ann_date).name(name).offset(offset).limit(limit).build();
        return fundDataService.fund_manager(params);
    }

    @Override
    public Result<?> fund_share(String ts_code, String trade_date, String start_date, String end_date) {
        FundShareParams params = FundShareParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return fundDataService.fund_share(params);
    }

    @Override
    public Result<?> fund_nav(String ts_code, String nav_date, String market, String start_date, String end_date) {
        FundNavParams params = FundNavParams.builder().ts_code(ts_code).nav_date(nav_date).market(market).start_date(start_date).end_date(end_date).build();
        return fundDataService.fund_nav(params);
    }

    @Override
    public Result<?> fund_div(String ann_date, String ex_date, String pay_date, String ts_code) {
        FundDivParams params = FundDivParams.builder().ann_date(ann_date).ex_date(ex_date).pay_date(pay_date).ts_code(ts_code).build();
        return fundDataService.fund_div(params);
    }

    @Override
    public Result<?> fund_portfolio(String ts_code, String ann_date, String start_date, String end_date) {
        FundPortfolioParams params = FundPortfolioParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).build();
        return fundDataService.fund_portfolio(params);
    }

    @Override
    public Result<?> fund_daily(String ts_code, String trade_date, String start_date, String end_date) {
        FundDailyParams params = FundDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return fundDataService.fund_daily(params);
    }

    @Override
    public Result<?> fund_adj(String ts_code, String trade_date, String start_date, String end_date, String offset, String limit) {
        FundAdjParams params = FundAdjParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).offset(offset).limit(limit).build();
        return fundDataService.fund_adj(params);
    }
}
