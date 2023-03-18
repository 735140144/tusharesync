package luckyboy.service.Impl;

import luckyboy.api.SgeDataApi;
import luckyboy.params.sge.SgeBasicParams;
import luckyboy.params.sge.SgeDailyParams;
import luckyboy.service.SgeDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class SgeDataApiImpl implements SgeDataApi {
    @Autowired
    private SgeDataService sgeDataService;

    @Override
    public Result<?> sge_basic(String ts_code) {
        SgeBasicParams build = SgeBasicParams.builder().ts_code(ts_code).build();
        return sgeDataService.sge_basic(build);
    }

    @Override
    public Result<?> sge_daily(String ts_code, String trade_date, String start_date, String end_date) {
        SgeDailyParams build = SgeDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return sgeDataService.sge_daily(build);
    }
}
