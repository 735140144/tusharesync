package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.hk.*;
import luckyboy.params.hk.*;
import luckyboy.result.hk.*;
import luckyboy.service.HkDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class HkDataServiceImpl implements HkDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private HkBasicMapper hkBasicMapper;
	@Resource
	private HkDailyMapper hkDailyMapper;
	@Resource
	private HkTradecalMapper hkTradecalMapper;
	@Resource
	private HkMinsMapper hkMinsMapper;
    @Override
    public Result<?> hk_basic(HkBasicParams params) {
        log.info("开始拉取港股列表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new HkBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HkBasicResult> trans = transResult.trans(jsonObject, HkBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            hkBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("hk").params(JSONObject.toJSONString(params)).api(apiName).comment("港股列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> hk_daily(HkDailyParams params) {
        log.info("开始拉取港股行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new HkDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HkDailyResult> trans = transResult.trans(jsonObject, HkDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            hkDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("hk").params(JSONObject.toJSONString(params)).api(apiName).comment("港股行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> hk_tradecal(HkTradecalParams params) {
        log.info("开始拉取港股交易日历,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new HkTradecalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HkTradecalResult> trans = transResult.trans(jsonObject, HkTradecalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            hkTradecalMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("hk").params(JSONObject.toJSONString(params)).api(apiName).comment("港股交易日历").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> hk_mins(HkMinsParams params) {
        log.info("开始拉取港股分钟行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new HkMinsResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HkMinsResult> trans = transResult.trans(jsonObject, HkMinsResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            hkMinsMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("hk").params(JSONObject.toJSONString(params)).api(apiName).comment("港股分钟行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}