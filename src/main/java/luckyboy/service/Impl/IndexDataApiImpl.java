package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.IndexDataApi;
import luckyboy.params.index.*;
import luckyboy.service.IndexDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IndexDataApiImpl implements IndexDataApi {
    @Autowired
    private IndexDataService indexDataService;

    @Override
    public Result<?> index_basic(String ts_code, String name, String market, String publisher, String category) {
        IndexBasicParams params = IndexBasicParams.builder().ts_code(ts_code).name(name).market(market).publisher(publisher).category(category).build();
        return indexDataService.index_basic(params);
    }

    @Override
    public Result<?> index_daily(String ts_code, String trade_date, String start_date, String end_date) {
        IndexDailyParams params = IndexDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.index_daily(params);
    }

    @Override
    public Result<?> index_weekly(String ts_code, String trade_date, String start_date, String end_date) {
        IndexWeeklyParams params = IndexWeeklyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.index_weekly(params);
    }

    @Override
    public Result<?> index_monthly(String ts_code, String trade_date, String start_date, String end_date) {
        IndexMonthlyParams params = IndexMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.index_monthly(params);
    }

    @Override
    public Result<?> index_weight(String index_code, String trade_date, String start_date, String end_date) {
        IndexWeightParams params = IndexWeightParams.builder().index_code(index_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.index_weight(params);
    }

    @Override
    public Result<?> index_dailybasic(String ts_code, String trade_date, String start_date, String end_date) {
        IndexDailybasicParams params = IndexDailybasicParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.index_dailybasic(params);
    }

    @Override
    public Result<?> index_classify(String index_code, String level, String parent_code, String src) {
        IndexClassifyParams params = IndexClassifyParams.builder().index_code(index_code).level(level).parent_code(parent_code).src(src).build();
        return indexDataService.index_classify(params);
    }

    @Override
    public Result<?> index_member(String index_code, String ts_code, String is_new) {
        IndexMemberParams params = IndexMemberParams.builder().index_code(index_code).ts_code(ts_code).is_new(is_new).build();
        return indexDataService.index_member(params);
    }

    @Override
    public Result<?> daily_info(String ts_code, String trade_date, String start_date, String end_date, String exchange, String fields) {
        DailyInfoParams params = DailyInfoParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).exchange(exchange).fields(fields).build();
        return indexDataService.daily_info(params);
    }

    @Override
    public Result<?> sz_daily_info(String ts_code, String trade_date, String start_date, String end_date) {
        SzDailyInfoParams params = SzDailyInfoParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.sz_daily_info(params);
    }

    @Override
    public Result<?> ths_index(String ts_code, String exchange, String type) {
        ThsIndexParams params = ThsIndexParams.builder().ts_code(ts_code).exchange(exchange).type(type).build();
        return indexDataService.ths_index(params);
    }

    @Override
    public Result<?> ths_daily(String ts_code, String trade_date, String start_date, String end_date) {
        ThsDailyParams params = ThsDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.ths_daily(params);
    }

    @Override
    public Result<?> ths_member(String ts_code, String code) {
        ThsMemberParams params = ThsMemberParams.builder().ts_code(ts_code).code(code).build();
        return indexDataService.ths_member(params);
    }

    @Override
    public Result<?> index_global(String ts_code, String trade_date, String start_date, String end_date) {
        IndexGlobalParams params = IndexGlobalParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return indexDataService.index_global(params);
    }

    @Override
    public Result<?> getAllThsIndex() {
        return Result.ok(indexDataService.getAllThs());
    }
}
