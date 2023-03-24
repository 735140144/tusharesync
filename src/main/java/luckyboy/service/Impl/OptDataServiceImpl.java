package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.opt.OptBasicMapper;
import luckyboy.mapper.opt.OptDailyMapper;
import luckyboy.params.opt.OptBasicParams;
import luckyboy.params.opt.OptDailyParams;
import luckyboy.result.opt.OptBasicResult;
import luckyboy.result.opt.OptDailyResult;
import luckyboy.service.OptDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OptDataServiceImpl implements OptDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private OptBasicMapper optBasicMapper;

    @Resource
    private OptDailyMapper optDailyMapper;


    @Override
    public Result<?> opt_basic(OptBasicParams params) {
        log.info("开始拉取期权合约信息,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new OptBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<OptBasicResult> trans = transResult.trans(jsonObject, OptBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            optBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("opt").params(JSONObject.toJSONString(params)).api(apiName).comment("期权合约信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> opt_daily(OptDailyParams params) {
        log.info("开始拉取期权日线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new OptDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<OptDailyResult> trans = transResult.trans(jsonObject, OptDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            optDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("opt").params(JSONObject.toJSONString(params)).api(apiName).comment("期权日线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
