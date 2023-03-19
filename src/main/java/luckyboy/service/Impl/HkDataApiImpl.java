package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.HkDataApi;
import luckyboy.params.hk.*;
import luckyboy.service.HkDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class HkDataApiImpl implements HkDataApi {
    @Autowired
    private HkDataService hkDataService;

    @Override
    public Result<?> hk_basic(String ts_code,String list_status) {
        HkBasicParams build = HkBasicParams.builder().ts_code(ts_code).list_status(list_status).build();
        return hkDataService.hk_basic(build);
    }

    @Override
    public Result<?> hk_daily(String ts_code,String trade_date,String start_date,String end_date) {
        HkDailyParams build = HkDailyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return hkDataService.hk_daily(build);
    }

    @Override
    public Result<?> hk_tradecal(String start_date,String end_date,String is_open) {
        HkTradecalParams build = HkTradecalParams.builder().start_date(start_date).end_date(end_date).is_open(is_open).build();
        return hkDataService.hk_tradecal(build);
    }

    @Override
    public Result<?> hk_mins(String ts_code,String freq,String start_date,String end_date) {
        HkMinsParams build = HkMinsParams.builder().ts_code(ts_code).freq(freq).start_date(start_date).end_date(end_date).build();
        return hkDataService.hk_mins(build);
    }

}