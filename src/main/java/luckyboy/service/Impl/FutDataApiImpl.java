package luckyboy.service.Impl;

import luckyboy.api.FutDataApi;
import luckyboy.params.fut.*;
import luckyboy.service.FutDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FutDataApiImpl implements FutDataApi {
    @Autowired
    private FutDataService futDataService;

    @Override
    public Result<?> fut_basic(String exchange, String fut_type) {
        FutBasicParams build = FutBasicParams.builder().exchange(exchange).fut_type(fut_type).build();
        return futDataService.fut_basic(build);
    }

    @Override
    public Result<?> fut_trade_cal(String exchange, String start_date, String end_date, String is_open) {
        FutTradeCalParams build = FutTradeCalParams.builder().exchange(exchange).start_date(start_date).end_date(end_date).is_open(is_open).build();
        return futDataService.fut_trade_cal(build);
    }

    @Override
    public Result<?> fut_daily(String trade_date, String ts_code, String exchange, String start_date, String end_date) {
        FutDailyParams build = FutDailyParams.builder().trade_date(trade_date).ts_code(ts_code).exchange(exchange).start_date(start_date).end_date(end_date).build();
        return futDataService.fut_daily(build);
    }

    @Override
    public Result<?> fut_holding(String trade_date, String symbol, String start_date, String end_date, String exchange) {
        FutHoldingParams build = FutHoldingParams.builder().trade_date(trade_date).symbol(symbol).start_date(start_date).end_date(end_date).exchange(exchange).build();
        return futDataService.fut_holding(build);
    }

    @Override
    public Result<?> fut_wsr(String trade_date, String symbol, String start_date, String end_date, String exchange) {
        FutWsrParams build = FutWsrParams.builder().trade_date(trade_date).symbol(symbol).start_date(start_date).end_date(end_date).exchange(exchange).build();
        return futDataService.fut_wsr(build);
    }

    @Override
    public Result<?> fut_settle(String trade_date, String ts_code, String start_date, String end_date, String exchange) {
        FutSettleParams build = FutSettleParams.builder().trade_date(trade_date).ts_code(ts_code).start_date(start_date).end_date(end_date).exchange(exchange).build();
        return futDataService.fut_settle(build);
    }

    @Override
    public Result<?> fut_index_daily(String trade_date, String ts_code, String start_date, String end_date) {
        FutIndexDailyParams build = FutIndexDailyParams.builder().trade_date(trade_date).ts_code(ts_code).start_date(start_date).end_date(end_date).build();
        return futDataService.fut_index_daily(build);
    }

    @Override
    public Result<?> fut_mapping(String trade_date, String ts_code, String start_date, String end_date) {
        FutMappingParams build = FutMappingParams.builder().trade_date(trade_date).ts_code(ts_code).start_date(start_date).end_date(end_date).build();
        return futDataService.fut_mapping(build);
    }

    @Override
    public Result<?> fut_weekly_detail(String week, String prd, String start_week, String end_week, String exchange, String fields) {
        FutWeeklyDetailParams build = FutWeeklyDetailParams.builder().week(week).prd(prd).start_week(start_week).end_week(end_week).exchange(exchange).fields(fields).build();
        return futDataService.fut_weekly_detail(build);
    }
}
