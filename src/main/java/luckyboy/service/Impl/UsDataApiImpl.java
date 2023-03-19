package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.UsDataApi;
import luckyboy.params.us.*;
import luckyboy.service.UsDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UsDataApiImpl implements UsDataApi {
    @Autowired
    private UsDataService usDataService;

    @Override
    public Result<?> us_daily(String ts_code,String trade_date,String start_date,String end_date) {
        UsDailyParams build = UsDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return usDataService.us_daily(build);
    }

    @Override
    public Result<?> us_basic(String ts_code,String classify,String offset,String limit) {
        UsBasicParams build = UsBasicParams.builder().ts_code(ts_code).classify(classify).offset(offset).limit(limit).build();
        return usDataService.us_basic(build);
    }

    @Override
    public Result<?> us_tradecal(String start_date,String end_date,String is_open) {
        UsTradecalParams build = UsTradecalParams.builder().start_date(start_date).end_date(end_date).is_open(is_open).build();
        return usDataService.us_tradecal(build);
    }

}