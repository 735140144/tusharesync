package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.*;
import luckyboy.mapper.hsStock.*;
import luckyboy.params.hsStock.*;
import luckyboy.result.hsStock.*;
import luckyboy.service.ReferenceDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ReferenceDataServiceImpl implements ReferenceDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private MarginMapper marginMapper;

    @Resource
    private MarginDetailMapper marginDetailMapper;

    @Resource
    private MarginTargetMapper marginTargetMapper;

    @Resource
    private Top10HoldersMapper top10HoldersMapper;

    @Resource
    private Top10FloatholdersMapper top10FloatholdersMapper;

    @Resource
    private TopListMapper topListMapper;

    @Resource
    private TopInstMapper topInstMapper;

    @Resource
    private PledgeStatMapper pledgeStatMapper;

    @Resource
    private PledgeDetailMapper pledgeDetailMapper;

    @Resource
    private RepurchaseMapper repurchaseMapper;

    @Resource
    private ConceptMapper conceptMapper;

    @Resource
    private ConceptDetailMapper conceptDetailMapper;

    @Resource
    private ShareFloatMapper shareFloatMapper;

    @Resource
    private BlockTradeMapper blockTradeMapper;

    @Resource
    private StkHoldernumberMapper stkHoldernumberMapper;

    @Resource
    private StkHoldertradeMapper stkHoldertradeMapper;

    @Override
    public Result<?> margin(MarginParams params) {
        log.info("开始拉取融资融券交易汇总,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new MarginResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<MarginResult> trans = transResult.trans(jsonObject, MarginResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            marginMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("融资融券交易汇总").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> margin_detail(MarginDetailParams params) {
        log.info("开始拉取融资融券交易明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new MarginDetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<MarginDetailResult> trans = transResult.trans(jsonObject, MarginDetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            marginDetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("融资融券交易明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> margin_target(MarginTargetParams params) {
        log.info("开始拉取融资融券标的,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new MarginTargetResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<MarginTargetResult> trans = transResult.trans(jsonObject, MarginTargetResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            marginTargetMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("融资融券标的").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> top10_holders(Top10HoldersParams params) {
        log.info("开始拉取前十大股东,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new Top10HoldersResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<Top10HoldersResult> trans = transResult.trans(jsonObject, Top10HoldersResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            top10HoldersMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("前十大股东").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> top10_floatholders(Top10FloatholdersParams params) {
        log.info("开始拉取前十大流通股东,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new Top10FloatholdersResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<Top10FloatholdersResult> trans = transResult.trans(jsonObject, Top10FloatholdersResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            top10FloatholdersMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("前十大流通股东").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> top_list(TopListParams params) {
        log.info("开始拉取龙虎榜每日明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new TopListResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TopListResult> trans = transResult.trans(jsonObject, TopListResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            topListMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("龙虎榜每日明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> top_inst(TopInstParams params) {
        log.info("开始拉取龙虎榜机构明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new TopInstResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TopInstResult> trans = transResult.trans(jsonObject, TopInstResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            topInstMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("龙虎榜机构明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> pledge_stat(PledgeStatParams params) {
        log.info("开始拉取股权质押统计数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new PledgeStatResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<PledgeStatResult> trans = transResult.trans(jsonObject, PledgeStatResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            pledgeStatMapper.insert(trans);
            for (PledgeStatResult tran : trans) {
                PledgeDetailParams detailParams = PledgeDetailParams.builder().ts_code(tran.getTs_code()).build();
                this.pledge_detail(detailParams);
            }
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("股权质押统计数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> pledge_detail(PledgeDetailParams params) {
        log.info("开始拉取股权质押明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new PledgeDetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<PledgeDetailResult> trans = transResult.trans(jsonObject, PledgeDetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            pledgeDetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("股权质押明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> repurchase(RepurchaseParams params) {
        log.info("开始拉取股票回购,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new RepurchaseResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<RepurchaseResult> trans = transResult.trans(jsonObject, RepurchaseResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            repurchaseMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("股票回购").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> concept(ConceptParams params) {
        log.info("开始拉取概念股分类,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ConceptResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ConceptResult> trans = transResult.trans(jsonObject, ConceptResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            conceptMapper.insert(trans);
            for (ConceptResult tran : trans) {
                ConceptDetailParams detailParams = ConceptDetailParams.builder().id(tran.getCode()).build();
                this.concept_detail(detailParams);
            }
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("概念股分类").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> concept_detail(ConceptDetailParams params) {
        log.info("开始拉取概念股列表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ConceptDetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ConceptDetailResult> trans = transResult.trans(jsonObject, ConceptDetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            conceptDetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("概念股列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> share_float(ShareFloatParams params) {
        log.info("开始拉取限售股解禁,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ShareFloatResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ShareFloatResult> trans = transResult.trans(jsonObject, ShareFloatResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            shareFloatMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("限售股解禁").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> block_trade(BlockTradeParams params) {
        log.info("开始拉取大宗交易,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BlockTradeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BlockTradeResult> trans = transResult.trans(jsonObject, BlockTradeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            blockTradeMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("大宗交易").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> stk_holdernumber(StkHoldernumberParams params) {
        log.info("开始拉取股东人数,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new StkHoldernumberResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkHoldernumberResult> trans = transResult.trans(jsonObject, StkHoldernumberResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            stkHoldernumberMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("股东人数").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> stk_holdertrade(StkHoldertradeParams params) {
        log.info("开始拉取股东增减持,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new StkHoldertradeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkHoldertradeResult> trans = transResult.trans(jsonObject, StkHoldertradeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            stkHoldertradeMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("股东增减持").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
