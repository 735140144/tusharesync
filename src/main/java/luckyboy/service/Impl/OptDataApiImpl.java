package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.OptDataApi;
import luckyboy.params.opt.OptBasicParams;
import luckyboy.params.opt.OptDailyParams;
import luckyboy.service.OptDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OptDataApiImpl implements OptDataApi {
    @Autowired
    private OptDataService optDataService;

    @Override
    public Result<?> opt_basic(String ts_code, String exchange, String call_put) {
        OptBasicParams build = OptBasicParams.builder().ts_code(ts_code).exchange(exchange).call_put(call_put).build();
        return optDataService.opt_basic(build);
    }

    @Override
    public Result<?> opt_daily(String ts_code, String trade_date, String start_date, String end_date, String exchange) {
        OptDailyParams build = OptDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).exchange(exchange).build();
        return optDataService.opt_daily(build);
    }
}
