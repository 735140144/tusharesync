package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.CbDataApi;
import luckyboy.params.cb.*;
import luckyboy.service.CbDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CbDataApiImpl implements CbDataApi {
    @Autowired
    private CbDataService cbDataService;

    @Override
    public Result<?> bond_blk_detail(String ts_code,String trade_date,String start_date,String end_date) {
        BondBlkDetailParams build = BondBlkDetailParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return cbDataService.bond_blk_detail(build);
    }

    @Override
    public Result<?> repo_daily(String ts_code,String trade_date,String start_date,String end_date) {
        RepoDailyParams build = RepoDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return cbDataService.repo_daily(build);
    }

    @Override
    public Result<?> cb_daily(String ts_code,String trade_date,String start_date,String end_date) {
        CbDailyParams build = CbDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return cbDataService.cb_daily(build);
    }

    @Override
    public Result<?> cb_basic(String ts_code,String list_date,String exchange) {
        CbBasicParams build = CbBasicParams.builder().ts_code(ts_code).list_date(list_date).exchange(exchange).build();
        return cbDataService.cb_basic(build);
    }

    @Override
    public Result<?> eco_cal(String date,String start_date,String end_date,String currency,String country,String event) {
        EcoCalParams build = EcoCalParams.builder().date(date).start_date(start_date).end_date(end_date).currency(currency).country(country).event(event).build();
        return cbDataService.eco_cal(build);
    }

    @Override
    public Result<?> cb_issue(String ts_code,String ann_date,String start_date,String end_date) {
        CbIssueParams build = CbIssueParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).build();
        return cbDataService.cb_issue(build);
    }

    @Override
    public Result<?> cb_share(String ts_code) {
        CbShareParams build = CbShareParams.builder().ts_code(ts_code).build();
        return cbDataService.cb_share(build);
    }

    @Override
    public Result<?> bond_blk(String ts_code,String trade_date,String start_date,String end_date) {
        BondBlkParams build = BondBlkParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return cbDataService.bond_blk(build);
    }

    @Override
    public Result<?> cb_call(String ts_code) {
        CbCallParams build = CbCallParams.builder().ts_code(ts_code).build();
        return cbDataService.cb_call(build);
    }

    @Override
    public Result<?> cb_price_chg(String ts_code) {
        CbPriceChgParams build = CbPriceChgParams.builder().ts_code(ts_code).build();
        return cbDataService.cb_price_chg(build);
    }

}