package luckyboy.service.Impl;

import luckyboy.api.CharacteristicDataApi;
import luckyboy.params.*;
import luckyboy.service.CharacteristicDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class CharacteristicDataApiImpl implements CharacteristicDataApi {
    @Autowired
    private CharacteristicDataService characteristicDataService;


    @Override
    public Result<?> report_rc(String ts_code, String report_date, String start_date, String end_date) {
        ReportRcParams params = ReportRcParams.builder().ts_code(ts_code).report_date(report_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.report_rc(params);
    }

    @Override
    public Result<?> cyq_perf(String ts_code, String trade_date, String start_date, String end_date) {
        CyqPerfParams params = CyqPerfParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.cyq_perf(params);
    }

    @Override
    public Result<?> cyq_chips(String ts_code, String trade_date, String start_date, String end_date) {
        CyqChipsParams params = CyqChipsParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.cyq_chips(params);
    }

    @Override
    public Result<?> stk_factor(String ts_code, String trade_date, String start_date, String end_date) {
        StkFactorParams params = StkFactorParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.stk_factor(params);
    }

    @Override
    public Result<?> ccass_hold(String ts_code, String hk_code, String trade_date, String start_date, String end_date) {
        CcassHoldParams params = CcassHoldParams.builder().ts_code(ts_code).hk_code(hk_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.ccass_hold(params);
    }

    @Override
    public Result<?> ccass_hold_detail(String ts_code, String hk_code, String trade_date, String start_date, String end_date) {
        CcassHoldDetailParams params = CcassHoldDetailParams.builder().ts_code(ts_code).hk_code(hk_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.ccass_hold_detail(params);
    }

    @Override
    public Result<?> hk_hold(String code, String ts_code, String trade_date, String start_date, String end_date, String exchange) {
        HkHoldParams params = HkHoldParams.builder().code(code).ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).exchange(exchange).build();
        return characteristicDataService.hk_hold(params);
    }

    @Override
    public Result<?> limit_list_d(String ts_code, String trade_date, String limit_type, String exchange, String start_date, String end_date) {
        LimitListDParams params = LimitListDParams.builder().ts_code(ts_code).trade_date(trade_date).limit_type(limit_type).exchange(exchange).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.limit_list_d(params);
    }

    @Override
    public Result<?> stk_surv(String ts_code, String trade_date, String start_date, String end_date) {
        StkSurvParams params = StkSurvParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return characteristicDataService.stk_surv(params);
    }

    @Override
    public Result<?> broker_recommend(String month) {
        BrokerRecommendParams params = BrokerRecommendParams.builder().month(month).build();
        return characteristicDataService.broker_recommend(params);
    }
}
