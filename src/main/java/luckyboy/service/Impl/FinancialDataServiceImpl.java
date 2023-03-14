package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.hsStock.*;
import luckyboy.params.hsStock.*;
import luckyboy.result.hsStock.*;
import luckyboy.service.FinancialDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class FinancialDataServiceImpl implements FinancialDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private InComeMapper inComeMapper;

    @Resource
    private BalanceSheetMapper balanceSheetMapper;

    @Resource
    private CashFlowMapper cashFlowMapper;

    @Resource
    private ForcecastMapper forcecastMapper;

    @Resource
    private ExpressMapper expressMapper;

    @Resource
    private DividendMapper dividendMapper;

    @Resource
    private FinaIndicatorMapper finaIndicatorMapper;

    @Resource
    private FinaAuditMapper finaAuditMapper;

    @Resource
    private FinaMainbzMapper finaMainbzMapper;

    @Resource
    private DisclosureDateMapper disclosureDateMapper;



    @Override
    public Result<?> income_vip(InComeParams params) {
        log.info("开始拉取利润表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new InComeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<InComeResult> trans = transResult.trans(jsonObject, InComeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            inComeMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("利润表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> balancesheet_vip(BalanceSheetParams params) {
        log.info("开始拉取资产负债表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BalanceSheetResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BalanceSheetResult> trans = transResult.trans(jsonObject, BalanceSheetResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            balanceSheetMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("资产负债表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cashflow_vip(CashFlowParams params) {
        log.info("开始拉取现金流量表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CashFlowResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CashFlowResult> trans = transResult.trans(jsonObject, CashFlowResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cashFlowMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("现金流量表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> forecast_vip(ForecastParams params) {
        log.info("开始拉取业绩预告,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ForcecastResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ForcecastResult> trans = transResult.trans(jsonObject, ForcecastResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            forcecastMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("业绩预告").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> express_vip(ExpressParams params) {
        log.info("开始拉取业绩快报,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new ExpressResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ExpressResult> trans = transResult.trans(jsonObject, ExpressResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            expressMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("业绩快报").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> dividend(DividendParams params) {
        log.info("开始拉取分红送股信息,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new DividendResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DividendResult> trans = transResult.trans(jsonObject, DividendResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            dividendMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("分红送股信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fina_indicator_vip(FinaIndicatorParams params) {
        log.info("开始拉取财务指标数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FinaIndicatorResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FinaIndicatorResult> trans = transResult.trans(jsonObject, FinaIndicatorResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            finaIndicatorMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财务指标数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fina_audit(FinaAuditParams params) {
        log.info("开始拉取财务审计意见,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FinaAuditResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FinaAuditResult> trans = transResult.trans(jsonObject, FinaAuditResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            finaAuditMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财务审计意见").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fina_mainbz_vip(FinaMainbzParams params) {
        log.info("开始拉取主营业务构成,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FinaMainbzResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FinaMainbzResult> trans = transResult.trans(jsonObject, FinaMainbzResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            finaMainbzMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("主营业务构成").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> disclosure_date(DisclosureDateParams params) {
        log.info("开始拉取财报披露计划,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new DisclosureDateResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DisclosureDateResult> trans = transResult.trans(jsonObject, DisclosureDateResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            disclosureDateMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财报披露计划").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
