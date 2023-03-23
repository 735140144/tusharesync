package luckyboy.service.Impl;

import luckyboy.api.MarketDataApi;
import luckyboy.params.hsStock.*;
import luckyboy.service.MarketDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class MarketDataApiImpl implements MarketDataApi {
    @Autowired
    private MarketDataService marketDataService;

    @Override
    public Result<?> daily(String ts_code, String trade_date, String start_date, String end_date) {
        DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.daily(build);
    }

    @Override
    public Result<?> weekly(String ts_code, String trade_date, String start_date, String end_date) {
        DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.weekly(build);
    }

    @Override
    public Result<?> monthly(String ts_code, String trade_date, String start_date, String end_date) {
        DailyWeeklyMonthlyParams build = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.monthly(build);
    }

    @Override
    public Result<?> adjFactor(String ts_code, String trade_date, String start_date, String end_date) {
        AdjFactorParams build = AdjFactorParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.adjFactor(build);
    }

    @Override
    public Result<?> suspendD(String ts_code, String trade_date, String start_date, String end_date) {
        SuspendDParams build = SuspendDParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.suspendD(build);
    }

    @Override
    public Result<?> daily_basic(String ts_code, String trade_date, String start_date, String end_date) {
        DailyBasicParams build = DailyBasicParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.daily_basic(build);
    }

    @Override
    public Result<?> moneyflow(String ts_code, String trade_date, String start_date, String end_date) {
        MoneyFlowParams build = MoneyFlowParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.moneyflow(build);
    }

    @Override
    public Result<?> stkLimit(String ts_code, String trade_date, String start_date, String end_date) {
        StkLimitParams build = StkLimitParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.stkLimit(build);
    }

    @Override
    public Result<?> moneyflowHsgt(String trade_date, String start_date, String end_date) {
        MoneyFlowHsgtParams build = MoneyFlowHsgtParams.builder().trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.moneyflowHsgt(build);
    }

    @Override
    public Result<?> hsgtTop10(String ts_code, String trade_date, String start_date, String end_date) {
        HsgtTop10Params build = HsgtTop10Params.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.hsgtTop10(build);
    }

    @Override
    public Result<?> ggtTop10(String ts_code, String trade_date, String start_date, String end_date) {
        GgtTop10Params build = GgtTop10Params.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.ggtTop10(build);
    }

    @Override
    public Result<?> ggtDaily(String trade_date, String start_date, String end_date) {
        GgtDailyParams build = GgtDailyParams.builder().trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return marketDataService.ggtDaily(build);
    }

    @Override
    public Result<?> ggtMonthly(String month, String start_month, String end_month) {
        GgtMonthlyParams build = GgtMonthlyParams.builder().month(month).start_month(start_month).end_month(end_month).build();
        return marketDataService.ggtMonthly(build);
    }
}
