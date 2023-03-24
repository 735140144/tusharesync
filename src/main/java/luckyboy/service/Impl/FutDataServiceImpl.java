package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.fut.*;
import luckyboy.params.fut.*;
import luckyboy.result.fut.*;
import luckyboy.service.FutDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class FutDataServiceImpl implements FutDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private FutBasicMapper futBasicMapper;

    @Resource
    private FutDailyMapper futDailyMapper;

    @Resource
    private FutHoldingMapper futHoldingMapper;

    @Resource
    private FutIndexDailyMapper futIndexDailyMapper;

    @Resource
    private FutMappingMapper futMappingMapper;

    @Resource
    private FutSettleMapper futSettleMapper;

    @Resource
    private FutTradeCalMapper futTradeCalMapper;

    @Resource
    private FutWeeklyDetailMapper futWeeklyDetailMapper;

    @Resource
    private FutWsrMapper futWsrMapper;

    @Override
    public Result<?> fut_basic(FutBasicParams params) {
        log.info("开始拉取期货合约信息表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutBasicResult> trans = transResult.trans(jsonObject, FutBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货合约信息表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_trade_cal(FutTradeCalParams params) {
        log.info("开始拉取期货交易日历,时间戳：{}", System.currentTimeMillis());
        String apiName = "trade_cal";
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutTradeCalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutTradeCalResult> trans = transResult.trans(jsonObject, FutTradeCalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futTradeCalMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货交易日历").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_daily(FutDailyParams params) {
        log.info("开始拉取期货日线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutDailyResult> trans = transResult.trans(jsonObject, FutDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货日线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_holding(FutHoldingParams params) {
        log.info("开始拉取每日成交持仓排名,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutHoldingResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutHoldingResult> trans = transResult.trans(jsonObject, FutHoldingResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futHoldingMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("每日成交持仓排名").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_wsr(FutWsrParams params) {
        log.info("开始拉取期货仓单日报,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutWsrResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutWsrResult> trans = transResult.trans(jsonObject, FutWsrResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futWsrMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货仓单日报").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_settle(FutSettleParams params) {
        log.info("开始拉取期货结算参数,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutSettleResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutSettleResult> trans = transResult.trans(jsonObject, FutSettleResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futSettleMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货结算参数").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_index_daily(FutIndexDailyParams params) {
        log.info("开始拉取南华期货指数日线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = "index_daily";
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutIndexDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutIndexDailyResult> trans = transResult.trans(jsonObject, FutIndexDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futIndexDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("南华期货指数日线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_mapping(FutMappingParams params) {
        log.info("开始拉取期货主力与连续合约,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutMappingResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutMappingResult> trans = transResult.trans(jsonObject, FutMappingResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futMappingMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货主力与连续合约").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fut_weekly_detail(FutWeeklyDetailParams params) {
        log.info("开始拉取期货主要品种交易周报,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FutWeeklyDetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FutWeeklyDetailResult> trans = transResult.trans(jsonObject, FutWeeklyDetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            futWeeklyDetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fut").params(JSONObject.toJSONString(params)).api(apiName).comment("期货主要品种交易周报").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
