package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.TmtDataApi;
import luckyboy.params.tmt.*;
import luckyboy.service.TmtDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TmtDataApiImpl implements TmtDataApi {
    @Autowired
    private TmtDataService tmtDataService;

    @Override
    public Result<?> bo_weekly(String date) {
        BoWeeklyParams build = BoWeeklyParams.builder().date(date).build();
        return tmtDataService.bo_weekly(build);
    }

    @Override
    public Result<?> tmt_twincomedetail(String date,String item,String symbol,String start_date,String end_date,String source) {
        TmtTwincomedetailParams build = TmtTwincomedetailParams.builder().date(date).item(item).symbol(symbol).start_date(start_date).end_date(end_date).source(source).build();
        return tmtDataService.tmt_twincomedetail(build);
    }

    @Override
    public Result<?> bo_daily(String date) {
        BoDailyParams build = BoDailyParams.builder().date(date).build();
        return tmtDataService.bo_daily(build);
    }

    @Override
    public Result<?> teleplay_record(String report_date,String start_date,String end_date,String org,String name) {
        TeleplayRecordParams build = TeleplayRecordParams.builder().report_date(report_date).start_date(start_date).end_date(end_date).org(org).name(name).build();
        return tmtDataService.teleplay_record(build);
    }

    @Override
    public Result<?> bo_monthly(String date) {
        BoMonthlyParams build = BoMonthlyParams.builder().date(date).build();
        return tmtDataService.bo_monthly(build);
    }

    @Override
    public Result<?> film_record(String ann_date,String start_date,String end_date) {
        FilmRecordParams build = FilmRecordParams.builder().ann_date(ann_date).start_date(start_date).end_date(end_date).build();
        return tmtDataService.film_record(build);
    }

    @Override
    public Result<?> bo_cinema(String date) {
        BoCinemaParams build = BoCinemaParams.builder().date(date).build();
        return tmtDataService.bo_cinema(build);
    }

    @Override
    public Result<?> tmt_twincome(String date,String item,String start_date,String end_date) {
        TmtTwincomeParams build = TmtTwincomeParams.builder().date(date).item(item).start_date(start_date).end_date(end_date).build();
        return tmtDataService.tmt_twincome(build);
    }

}