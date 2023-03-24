package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.sge.SgeBasicMapper;
import luckyboy.mapper.sge.SgeDailyMapper;
import luckyboy.params.sge.SgeBasicParams;
import luckyboy.params.sge.SgeDailyParams;
import luckyboy.result.sge.SgeBasicResult;
import luckyboy.result.sge.SgeDailyResult;
import luckyboy.service.SgeDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class SgeDataServiceImpl implements SgeDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private SgeBasicMapper sgeBasicMapper;

    @Resource
    private SgeDailyMapper sgeDailyMapper;

    @Override
    public Result<?> sge_basic(SgeBasicParams params) {
        log.info("开始拉取黄金现货基础信息,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new SgeBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<SgeBasicResult> trans = transResult.trans(jsonObject, SgeBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            sgeBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("sge").params(JSONObject.toJSONString(params)).api(apiName).comment("黄金现货基础信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> sge_daily(SgeDailyParams params) {
        log.info("开始拉取现货黄金日行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new SgeDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<SgeDailyResult> trans = transResult.trans(jsonObject, SgeDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            sgeDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("sge").params(JSONObject.toJSONString(params)).api(apiName).comment("现货黄金日行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
