package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.cb.*;
import luckyboy.params.cb.*;
import luckyboy.result.cb.*;
import luckyboy.service.CbDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class CbDataServiceImpl implements CbDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private BondBlkDetailMapper bondBlkDetailMapper;
	@Resource
	private RepoDailyMapper repoDailyMapper;
	@Resource
	private CbDailyMapper cbDailyMapper;
	@Resource
	private CbBasicMapper cbBasicMapper;
	@Resource
	private EcoCalMapper ecoCalMapper;
	@Resource
	private CbIssueMapper cbIssueMapper;
	@Resource
	private CbShareMapper cbShareMapper;
	@Resource
	private BondBlkMapper bondBlkMapper;
	@Resource
	private CbCallMapper cbCallMapper;
	@Resource
	private CbPriceChgMapper cbPriceChgMapper;
    @Override
    public Result<?> bond_blk_detail(BondBlkDetailParams params) {
        log.info("开始拉取大宗交易明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BondBlkDetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BondBlkDetailResult> trans = transResult.trans(jsonObject, BondBlkDetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            bondBlkDetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("大宗交易明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> repo_daily(RepoDailyParams params) {
        log.info("开始拉取债券回购日行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new RepoDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<RepoDailyResult> trans = transResult.trans(jsonObject, RepoDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            repoDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("债券回购日行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cb_daily(CbDailyParams params) {
        log.info("开始拉取可转债行情,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CbDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CbDailyResult> trans = transResult.trans(jsonObject, CbDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cbDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("可转债行情").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cb_basic(CbBasicParams params) {
        log.info("开始拉取可转债基本信息,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CbBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CbBasicResult> trans = transResult.trans(jsonObject, CbBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cbBasicMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("可转债基本信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> eco_cal(EcoCalParams params) {
        log.info("开始拉取财经日历,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new EcoCalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<EcoCalResult> trans = transResult.trans(jsonObject, EcoCalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            ecoCalMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("财经日历").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cb_issue(CbIssueParams params) {
        log.info("开始拉取可转债发行,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CbIssueResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CbIssueResult> trans = transResult.trans(jsonObject, CbIssueResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cbIssueMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("可转债发行").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cb_share(CbShareParams params) {
        log.info("开始拉取可转债转股结果,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CbShareResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CbShareResult> trans = transResult.trans(jsonObject, CbShareResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cbShareMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("可转债转股结果").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> bond_blk(BondBlkParams params) {
        log.info("开始拉取债券大宗交易,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BondBlkResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BondBlkResult> trans = transResult.trans(jsonObject, BondBlkResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            bondBlkMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("债券大宗交易").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cb_call(CbCallParams params) {
        log.info("开始拉取可转债赎回信息,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CbCallResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CbCallResult> trans = transResult.trans(jsonObject, CbCallResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cbCallMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("可转债赎回信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cb_price_chg(CbPriceChgParams params) {
        log.info("开始拉取可转债转股价变动,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CbPriceChgResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CbPriceChgResult> trans = transResult.trans(jsonObject, CbPriceChgResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cbPriceChgMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("可转债转股价变动").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}