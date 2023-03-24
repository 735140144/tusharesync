package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.us.*;
import luckyboy.params.us.*;
import luckyboy.result.us.*;
import luckyboy.service.UsDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class UsDataServiceImpl implements UsDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private UsDailyMapper usDailyMapper;
	@Resource
	private UsBasicMapper usBasicMapper;
	@Resource
	private UsTradecalMapper usTradecalMapper;
    @Override
    public Result<?> us_daily(UsDailyParams params) {
        log.info("开始拉取美股交易日历,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new UsDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<UsDailyResult> trans = transResult.trans(jsonObject, UsDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            usDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("us").params(JSONObject.toJSONString(params)).api(apiName).comment("美股交易日历").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> us_basic(UsBasicParams params) {
        log.info("开始拉取美股列表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new UsBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<UsBasicResult> trans = transResult.trans(jsonObject, UsBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            usBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("us").params(JSONObject.toJSONString(params)).api(apiName).comment("美股列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> us_tradecal(UsTradecalParams params) {
        log.info("开始拉取美股行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new UsTradecalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<UsTradecalResult> trans = transResult.trans(jsonObject, UsTradecalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            usTradecalMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("us").params(JSONObject.toJSONString(params)).api(apiName).comment("美股行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}