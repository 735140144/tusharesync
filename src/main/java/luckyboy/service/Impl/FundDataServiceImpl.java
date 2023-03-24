package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.fund.*;
import luckyboy.params.fund.*;
import luckyboy.result.fund.*;

import luckyboy.service.FundDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class FundDataServiceImpl implements FundDataService {
    @Resource
    private FailLogMapper failLogMapper;

    @Resource
    private FundBasicMapper fundBasicMapper;

    @Resource
    private FundCompanyMapper fundCompanyMapper;

    @Resource
    private FundManagerMapper fundManagerMapper;

    @Resource
    private FundShareMapper fundShareMapper;

    @Resource
    private FundNavMapper fundNavMapper;

    @Resource
    private FundDivMapper fundDivMapper;

    @Resource
    private FundPortfolioMapper fundPortfolioMapper;

    @Resource
    private FundDailyMapper fundDailyMapper;

    @Resource
    private FundAdjMapper fundAdjMapper;

    @Override
    public Result<?> fund_basic(FundBasicParams params) {
        log.info("开始拉取公募基金列表,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundBasicResult> trans = transResult.trans(jsonObject, FundBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("公募基金列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_company(FundCompanyParams params) {
        log.info("开始拉取公募基金公司,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundCompanyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundCompanyResult> trans = transResult.trans(jsonObject, FundCompanyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundCompanyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("公募基金公司").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_manager(FundManagerParams params) {
        log.info("开始拉取基金经理,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundManagerResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundManagerResult> trans = transResult.trans(jsonObject, FundManagerResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundManagerMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("基金经理").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_share(FundShareParams params) {
        log.info("开始拉取基金规模数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundShareResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundShareResult> trans = transResult.trans(jsonObject, FundShareResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundShareMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("基金规模数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_nav(FundNavParams params) {
        log.info("开始拉取公募基金净值,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundNavResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundNavResult> trans = transResult.trans(jsonObject, FundNavResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundNavMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("公募基金净值").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_div(FundDivParams params) {
        log.info("开始拉取公募基金分红,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundDivResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundDivResult> trans = transResult.trans(jsonObject, FundDivResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundDivMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("公募基金分红").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_portfolio(FundPortfolioParams params) {
        log.info("开始拉取公募基金持仓数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundPortfolioResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundPortfolioResult> trans = transResult.trans(jsonObject, FundPortfolioResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundPortfolioMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("公募基金持仓数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_daily(FundDailyParams params) {
        log.info("开始拉取场内基金日线行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundDailyResult> trans = transResult.trans(jsonObject, FundDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("场内基金日线行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> fund_adj(FundAdjParams params) {
        log.info("开始拉取基金复权因子,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FundAdjResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FundAdjResult> trans = transResult.trans(jsonObject, FundAdjResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            fundAdjMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("fund").params(JSONObject.toJSONString(params)).api(apiName).comment("基金复权因子").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public List<FundBasicResult> allfund() {
        return fundBasicMapper.allbasic();
    }
}
