package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.hsStock.*;
import luckyboy.params.hsStock.*;
import luckyboy.result.hsStock.*;
import luckyboy.service.BasicDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class BasicDataServiceImpl implements BasicDataService {

    @Resource
    private StockBasicMapper stockBasicMapper;

    @Resource
    private TraderCalMapper traderCalMapper;

    @Resource
    private NameChangeMapper nameChangeMapper;

    @Resource
    private HsConstMapper hsConstMapper;

    @Resource
    private StockComponyMapper stockComponyMapper;

    @Resource
    private StkManagersMapper stkManagersMapper;

    @Resource
    private StkRewardsMapper stkRewardsMapper;

    @Resource
    private NewShareMapper newShareMapper;

    @Resource
    private FailLogMapper failLogMapper;

    public static final String SH = "SH";

    @Override
    public Result<?> StockBasic(StockBasicParams params) {
        log.info("开始拉取股票列表,时间戳：{}",System.currentTimeMillis());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stock_basic").params(params.toJSONObject()).fields(new StockBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StockBasicResult> trans = transResult.trans(jsonObject, StockBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stockBasicMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("stock_basic").comment("股票列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> TradeCal(TradeCalParams params) {
        log.info("开始拉取交易日历,时间戳：{}",System.currentTimeMillis());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("trade_cal").params(params.toJSONObject()).fields(new TraderCalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TraderCalResult> trans = transResult.trans(jsonObject, TraderCalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            traderCalMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("trade_cal").comment("交易日历").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> NameChange(NameChangeParams params) {
        log.info("开始拉取股票曾用名,时间戳：{}",System.currentTimeMillis());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("namechange").params(params.toJSONObject()).fields(new NameChangeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<NameChangeResult> trans = transResult.trans(jsonObject, NameChangeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            nameChangeMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("namechange").comment("股票曾用名").if_retry(2).build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> HsConst(HsConstParams params) {
        log.info("开始拉取沪股通、深股通成分数据,时间戳：{},类型：{}",System.currentTimeMillis(),params.getHs_type());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("hs_const").params(params.toJSONObject()).fields(new HsConstResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HsConstResult> trans = transResult.trans(jsonObject, HsConstResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            if (SH.equals(params.getHs_type())){
                hsConstMapper.h_insert(trans);
            }else {
                hsConstMapper.s_insert(trans);
            }
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("hs_const").comment("沪股通、深股通成分").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> StockCompany(StockCompanyParams params) {
        log.info("开始拉取上市公司基本信息,时间戳：{}",System.currentTimeMillis());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stock_company").params(params.toJSONObject()).fields(new StockCompanyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StockCompanyResult> trans = transResult.trans(jsonObject, StockCompanyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stockComponyMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("stock_company").comment("上市公司基本信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> StkManagers(StkManagersParams params) {
        log.info("开始拉取上市公司管理层信息,时间戳：{},代码：{},开始时间：{}",System.currentTimeMillis(),params.getTs_code(),params.getStart_date());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stk_managers").params(params.toJSONObject()).fields(new StkManagersResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkManagersResult> trans = transResult.trans(jsonObject, StkManagersResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stkManagersMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("stk_managers").comment("上市公司管理层信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> StkRewards(StkRewardsParams params) {
        log.info("开始拉取管理层薪酬和持股信息,时间戳：{},代码：{},结束时间：{}",System.currentTimeMillis(),params.getTs_code(),params.getAnn_date());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stk_rewards").params(params.toJSONObject()).fields(new StkRewardsResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkRewardsResult> trans = transResult.trans(jsonObject, StkRewardsResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stkRewardsMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("stk_rewards").comment("管理层薪酬和持股信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> NewShare(NewShareParams params) {
        log.info("开始拉取IPO新股列表信息,时间戳：{},开始时间：{},结束时间：{}",System.currentTimeMillis(),params.getStart_date(),params.getEnd_date());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("new_share").params(params.toJSONObject()).fields(new NewShareResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<NewShareResult> trans = transResult.trans(jsonObject, NewShareResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            newShareMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("basic").params(JSONObject.toJSONString(params)).api("new_share").comment("IPO新股列表").if_retry(2).build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
