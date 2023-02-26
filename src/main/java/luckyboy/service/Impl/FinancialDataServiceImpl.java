package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.FailLogMapper;
import luckyboy.params.*;
import luckyboy.result.*;
import luckyboy.service.FinancialDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class FinancialDataServiceImpl implements FinancialDataService {
    @Resource
    private FailLogMapper failLogMapper;


    @Override
    public Result<?> income_vip() {
        log.info("开始拉取利润表,时间戳：{}", System.currentTimeMillis());
        InComeParams inComeParams = InComeParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(inComeParams.toJSONObject()).fields(new InComeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<InComeResult> trans = transResult.trans(jsonObject, InComeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("利润表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> balancesheet_vip() {
        log.info("开始拉取资产负债表,时间戳：{}", System.currentTimeMillis());
        BalanceSheetParams balanceSheetParams = BalanceSheetParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(balanceSheetParams.toJSONObject()).fields(new BalanceSheetResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BalanceSheetResult> trans = transResult.trans(jsonObject, BalanceSheetResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("资产负债表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cashflow_vip() {
        log.info("开始拉取现金流量表,时间戳：{}", System.currentTimeMillis());
        CashFlowParams cashFlowParams = CashFlowParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(cashFlowParams.toJSONObject()).fields(new CashFlowResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CashFlowResult> trans = transResult.trans(jsonObject, CashFlowResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("现金流量表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> forecast_vip() {
        log.info("开始拉取业绩预告,时间戳：{}", System.currentTimeMillis());
        ForecastParams forecastParams = ForecastParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(forecastParams.toJSONObject()).fields(new ForcecastResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ForcecastResult> trans = transResult.trans(jsonObject, ForcecastResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("业绩预告").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> express_vip() {
        log.info("开始拉取业绩快报,时间戳：{}", System.currentTimeMillis());
        ExpressParams expressParams = ExpressParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(expressParams.toJSONObject()).fields(new ExpressResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<ExpressResult> trans = transResult.trans(jsonObject, ExpressResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("业绩快报").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> dividend() {
        log.info("开始拉取分红送股信息,时间戳：{}", System.currentTimeMillis());
        DividendParams dividendParams = DividendParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(dividendParams.toJSONObject()).fields(new DividendResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DividendResult> trans = transResult.trans(jsonObject, DividendResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("分红送股信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fina_indicator_vip() {
        log.info("开始拉取财务指标数据,时间戳：{}", System.currentTimeMillis());
        FinaIndicatorParams finaIndicatorParams = FinaIndicatorParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(finaIndicatorParams.toJSONObject()).fields(new FinaIndicatorResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FinaIndicatorResult> trans = transResult.trans(jsonObject, FinaIndicatorResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财务指标数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fina_audit() {
        log.info("开始拉取财务审计意见,时间戳：{}", System.currentTimeMillis());
        FinaAuditParams finaAuditParams = FinaAuditParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(finaAuditParams.toJSONObject()).fields(new FinaAuditResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FinaAuditResult> trans = transResult.trans(jsonObject, FinaAuditResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财务审计意见").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fina_mainbz_vip() {
        log.info("开始拉取主营业务构成,时间戳：{}", System.currentTimeMillis());
        FinaMainbzParams finaMainbzParams = FinaMainbzParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(finaMainbzParams.toJSONObject()).fields(new FinaMainbzResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FinaMainbzResult> trans = transResult.trans(jsonObject, FinaMainbzResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("主营业务构成").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> disclosure_date() {
        log.info("开始拉取财报披露计划,时间戳：{}", System.currentTimeMillis());
        DisclosureDateParams disclosureDateParams = DisclosureDateParams.builder().build();
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(disclosureDateParams.toJSONObject()).fields(new DisclosureDateResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DisclosureDateResult> trans = transResult.trans(jsonObject, DisclosureDateResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
//            stockBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财报披露计划").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
