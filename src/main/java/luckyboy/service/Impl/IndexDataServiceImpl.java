package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.index.*;
import luckyboy.params.index.*;
import luckyboy.result.index.*;
import luckyboy.service.IndexDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class IndexDataServiceImpl implements IndexDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private DailyInfoMapper dailyInfoMapper;

    @Resource
    private IndexBasicMapper indexBasicMapper;

    @Resource
    private IndexClassifyMapper indexClassifyMapper;

    @Resource
    private IndexDailybasicMapper indexDailybasicMapper;

    @Resource
    private IndexDailyMapper indexDailyMapper;

    @Resource
    private IndexGlobalMapper indexGlobalMapper;

    @Resource
    private IndexMemberMapper indexMemberMapper;

    @Resource
    private IndexMonthlyMapper indexMonthlyMapper;

    @Resource
    private IndexWeeklyMapper indexWeeklyMapper;

    @Resource
    private IndexWeightMapper indexWeightMapper;

    @Resource
    private SzDailyInfoMapper szDailyInfoMapper;

    @Resource
    private ThsIndexMapper thsIndexMapper;

    @Resource
    private ThsDailyMapper thsDailyMapper;

    @Resource
    private ThsMemberMapper thsMemberMapper;

    @Override
    public Result<?> index_basic(IndexBasicParams params) {
        log.info("开始拉取指数基本信息,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexBasicResult> trans = transResult.trans(jsonObject, IndexBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("指数基本信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_daily(IndexDailyParams params) {
        log.info("开始拉取指数日线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexDailyResult> trans = transResult.trans(jsonObject, IndexDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("指数日线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_weekly(IndexWeeklyParams params) {
        log.info("开始拉取指数周线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexWeeklyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexWeeklyResult> trans = transResult.trans(jsonObject, IndexWeeklyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexWeeklyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("指数周线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_monthly(IndexMonthlyParams params) {
        log.info("开始拉取指数月线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexMonthlyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexMonthlyResult> trans = transResult.trans(jsonObject, IndexMonthlyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexMonthlyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("指数月线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_weight(IndexWeightParams params) {
        log.info("开始拉取指数成分和权重,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexWeightResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexWeightResult> trans = transResult.trans(jsonObject, IndexWeightResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexWeightMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("指数成分和权重").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_dailybasic(IndexDailybasicParams params) {
        log.info("开始拉取大盘指数每日指标,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexDailybasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexDailybasicResult> trans = transResult.trans(jsonObject, IndexDailybasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexDailybasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("大盘指数每日指标").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_classify(IndexClassifyParams params) {
        log.info("开始拉取申万行业分类,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexClassifyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexClassifyResult> trans = transResult.trans(jsonObject, IndexClassifyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexClassifyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("申万行业分类").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_member(IndexMemberParams params) {
        log.info("开始拉取申万行业成分构成,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexMemberResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexMemberResult> trans = transResult.trans(jsonObject, IndexMemberResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexMemberMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("申万行业成分构成").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> daily_info(DailyInfoParams params) {
        log.info("开始拉取市场交易统计,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new DailyInfoResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DailyInfoResult> trans = transResult.trans(jsonObject, DailyInfoResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            dailyInfoMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("市场交易统计").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> sz_daily_info(SzDailyInfoParams params) {
        log.info("开始拉取深圳市场每日交易概况,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new SzDailyInfoResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<SzDailyInfoResult> trans = transResult.trans(jsonObject, SzDailyInfoResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            szDailyInfoMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("深圳市场每日交易概况").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ths_index(ThsIndexParams params) {
        log.info("开始拉取同花顺概念和行业指数,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ThsIndexResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ThsIndexResult> trans = transResult.trans(jsonObject, ThsIndexResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            thsIndexMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("同花顺概念和行业指数").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ths_daily(ThsDailyParams params) {
        log.info("开始拉取同花顺板块指数行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ThsDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ThsDailyResult> trans = transResult.trans(jsonObject, ThsDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            thsDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("同花顺板块指数行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ths_member(ThsMemberParams params) {
        log.info("开始拉取同花顺概念板块成分,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ThsMemberResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ThsMemberResult> trans = transResult.trans(jsonObject, ThsMemberResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            thsMemberMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("同花顺概念板块成分").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> index_global(IndexGlobalParams params) {
        log.info("开始拉取国际指数,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new IndexGlobalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<IndexGlobalResult> trans = transResult.trans(jsonObject, IndexGlobalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            indexGlobalMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("国际指数").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
