package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.fx.*;
import luckyboy.params.fx.*;
import luckyboy.result.fx.*;
import luckyboy.service.FxDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class FxDataServiceImpl implements FxDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private FxObasicMapper fxObasicMapper;
	@Resource
	private FxDailyMapper fxDailyMapper;
    @Override
    public Result<?> fx_obasic(FxObasicParams params) {
        log.info("开始拉取外汇基础信息（海外）,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FxObasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FxObasicResult> trans = transResult.trans(jsonObject, FxObasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fxObasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fx").params(JSONObject.toJSONString(params)).api(apiName).comment("外汇基础信息（海外）").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fx_daily(FxDailyParams params) {
        log.info("开始拉取外汇日线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FxDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FxDailyResult> trans = transResult.trans(jsonObject, FxDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fxDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fx").params(JSONObject.toJSONString(params)).api(apiName).comment("外汇日线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}