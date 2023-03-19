package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.FxDataApi;
import luckyboy.params.fx.*;
import luckyboy.service.FxDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FxDataApiImpl implements FxDataApi {
    @Autowired
    private FxDataService fxDataService;

    @Override
    public Result<?> fx_obasic(String exchange,String classify,String ts_code) {
        FxObasicParams build = FxObasicParams.builder().exchange(exchange).classify(classify).ts_code(ts_code).build();
        return fxDataService.fx_obasic(build);
    }

    @Override
    public Result<?> fx_daily(String ts_code,String trade_date,String start_date,String end_date,String exchange) {
        FxDailyParams build = FxDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).exchange(exchange).build();
        return fxDataService.fx_daily(build);
    }

}