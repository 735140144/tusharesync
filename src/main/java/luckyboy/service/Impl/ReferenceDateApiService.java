package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.ReferenceDataApi;
import luckyboy.params.hsStock.*;
import luckyboy.service.ReferenceDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReferenceDateApiService implements ReferenceDataApi {
    @Autowired
    private ReferenceDataService referenceDataService;

    @Override
    public Result<?> margin(String trade_date, String exchange_id, String start_date, String end_date) {
        MarginParams params = MarginParams.builder().trade_date(trade_date).exchange_id(exchange_id).start_date(start_date).end_date(end_date).build();
        return referenceDataService.margin(params);
    }

    @Override
    public Result<?> margin_detail(String trade_date, String ts_code, String start_date, String end_date) {
        MarginDetailParams params = MarginDetailParams.builder().trade_date(trade_date).ts_code(ts_code).start_date(start_date).end_date(end_date).build();
        return referenceDataService.margin_detail(params);
    }

    @Override
    public Result<?> margin_target(String ts_code, String is_new, String mg_type) {
        MarginTargetParams params = MarginTargetParams.builder().ts_code(ts_code).is_new(is_new).mg_type(mg_type).build();
        return referenceDataService.margin_target(params);
    }

    @Override
    public Result<?> top10_holders(String ts_code, String period, String ann_date, String start_date, String end_date) {
        Top10HoldersParams params = Top10HoldersParams.builder().ts_code(ts_code).period(period).ann_date(ann_date).start_date(start_date).end_date(end_date).build();
        return referenceDataService.top10_holders(params);
    }

    @Override
    public Result<?> top10_floatholders(String ts_code, String period, String ann_date, String start_date, String end_date) {
        Top10FloatholdersParams params = Top10FloatholdersParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).build();
        return referenceDataService.top10_floatholders(params);
    }

    @Override
    public Result<?> top_list(String trade_date, String ts_code) {
        TopListParams params = TopListParams.builder().trade_date(trade_date).ts_code(ts_code).build();
        return referenceDataService.top_list(params);
    }

    @Override
    public Result<?> top_inst(String trade_date, String ts_code) {
        TopInstParams params = TopInstParams.builder().ts_code(ts_code).trade_date(trade_date).build();
        return referenceDataService.top_inst(params);
    }

    @Override
    public Result<?> pledge_stat(String end_date, String ts_code) {
        PledgeStatParams params = PledgeStatParams.builder().ts_code(ts_code).end_date(end_date).build();
        return referenceDataService.pledge_stat(params);
    }

    @Override
    public Result<?> pledge_detail(String ts_code) {
        PledgeDetailParams params = PledgeDetailParams.builder().ts_code(ts_code).build();
        return referenceDataService.pledge_detail(params);
    }

    @Override
    public Result<?> repurchase(String ann_date, String start_date, String end_date) {
        RepurchaseParams params = RepurchaseParams.builder().ann_date(ann_date).start_date(start_date).end_date(end_date).build();
        return referenceDataService.repurchase(params);
    }

    @Override
    public Result<?> concept(String src) {
        ConceptParams params = ConceptParams.builder().src(src).build();
        return referenceDataService.concept(params);
    }

    @Override
    public Result<?> concept_detail(String id, String ts_code) {
        ConceptDetailParams params = ConceptDetailParams.builder().id(id).ts_code(ts_code).build();
        return referenceDataService.concept_detail(params);
    }

    @Override
    public Result<?> share_float(String ts_code, String ann_date, String float_date, String start_date, String end_date) {
        ShareFloatParams params = ShareFloatParams.builder().ts_code(ts_code).ann_date(ann_date).float_date(float_date).start_date(start_date).end_date(end_date).build();
        return referenceDataService.share_float(params);
    }

    @Override
    public Result<?> block_trade(String ts_code, String trade_date, String start_date, String end_date) {
        BlockTradeParams params = BlockTradeParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return referenceDataService.block_trade(params);
    }

    @Override
    public Result<?> stk_holdernumber(String ts_code, String enddate, String start_date, String end_date) {
        StkHoldernumberParams params = StkHoldernumberParams.builder().ts_code(ts_code).end_date(end_date).start_date(start_date).end_date(end_date).build();
        return referenceDataService.stk_holdernumber(params);
    }

    @Override
    public Result<?> stk_holdertrade(String ts_code, String ann_date, String start_date, String end_date, String trade_type, String holder_type) {
        StkHoldertradeParams params = StkHoldertradeParams.builder().ts_code(ts_code).ann_date(ann_date).start_date(start_date).end_date(end_date).trade_type(trade_type).holder_type(holder_type).build();
        return referenceDataService.stk_holdertrade(params);
    }
}
