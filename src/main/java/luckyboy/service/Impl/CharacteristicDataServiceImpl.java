package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.*;
import luckyboy.mapper.hsStock.*;
import luckyboy.params.hsStock.*;
import luckyboy.result.hsStock.*;
import luckyboy.service.CharacteristicDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class CharacteristicDataServiceImpl implements CharacteristicDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private ReportRcMapper reportRcMapper;

    @Resource
    private CyqPerfMapper cyqPerfMapper;

    @Resource
    private CyqChipsMapper cyqChipsMapper;

    @Resource
    private StkFactorMapper stkFactorMapper;

    @Resource
    private CcassHoldMapper ccassHoldMapper;

    @Resource
    private CcassHoldDetailMapper ccassHoldDetailMapper;

    @Resource
    private HkHoldMapper hkHoldMapper;

    @Resource
    private LimitListDMapper limitListDMapper;

    @Resource
    private StkSurvMapper stkSurvMapper;

    @Resource
    private BrokerRecommendMapper brokerRecommendMapper;


    @Override
    public Result<?> report_rc(ReportRcParams params) {
        log.info("开始拉取卖方盈利预测数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ReportRcResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ReportRcResult> trans = transResult.trans(jsonObject, ReportRcResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            reportRcMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("卖方盈利预测数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cyq_perf(CyqPerfParams params) {
        log.info("开始拉取每日筹码及胜率,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CyqPerfResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CyqPerfResult> trans = transResult.trans(jsonObject, CyqPerfResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cyqPerfMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("每日筹码及胜率").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cyq_chips(CyqChipsParams params) {
        log.info("开始拉取每日筹码分布,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CyqChipsResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CyqChipsResult> trans = transResult.trans(jsonObject, CyqChipsResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cyqChipsMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("每日筹码分布").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> stk_factor(StkFactorParams params) {
        log.info("开始拉取股票技术面因子,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new StkFactorResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkFactorResult> trans = transResult.trans(jsonObject, StkFactorResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            stkFactorMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("股票技术面因子").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ccass_hold(CcassHoldParams params) {
        log.info("开始拉取中央结算系统持股统计,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CcassHoldResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CcassHoldResult> trans = transResult.trans(jsonObject, CcassHoldResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            ccassHoldMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("中央结算系统持股统计").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ccass_hold_detail(CcassHoldDetailParams params) {
        log.info("开始拉取中央结算系统持股明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CcassHoldDetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CcassHoldDetailResult> trans = transResult.trans(jsonObject, CcassHoldDetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            ccassHoldDetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("中央结算系统持股明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> hk_hold(HkHoldParams params) {
        log.info("开始拉取沪深股通持股明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new HkHoldResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HkHoldResult> trans = transResult.trans(jsonObject, HkHoldResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            hkHoldMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("沪深股通持股明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> limit_list_d(LimitListDParams params) {
        log.info("开始拉取涨跌停和炸板数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new LimitListDResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<LimitListDResult> trans = transResult.trans(jsonObject, LimitListDResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            limitListDMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("涨跌停和炸板数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> stk_surv(StkSurvParams params) {
        log.info("开始拉取机构调研数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new StkSurvResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkSurvResult> trans = transResult.trans(jsonObject, StkSurvResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            stkSurvMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("机构调研数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> broker_recommend(BrokerRecommendParams params) {
        log.info("开始拉取券商月度金股,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BrokerRecommendResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BrokerRecommendResult> trans = transResult.trans(jsonObject, BrokerRecommendResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            brokerRecommendMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("券商月度金股").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
