package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.*;
import luckyboy.params.*;
import luckyboy.result.*;
import luckyboy.service.BasicDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.scheduling.annotation.Scheduled;
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
    public Result<?> StockBasic() {
        log.info("开始拉取股票列表,时间戳：{}",System.currentTimeMillis());
        StockBasicParams basicParams = StockBasicParams.builder().build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stock_basic").params(basicParams.toJSONObject()).fields(new StockBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StockBasicResult> trans = transResult.trans(jsonObject, StockBasicResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stockBasicMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("stock_basic").comment("股票列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> TradeCal(String start,String end) {
        log.info("开始拉取交易日历,时间戳：{},开始时间：{},结束时间：{}",System.currentTimeMillis(),start,end);
        TradeCalParams tradeCalParams = TradeCalParams.builder().start_date(start).end_date(end).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("trade_cal").params(tradeCalParams.toJSONObject()).fields(new TraderCalResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TraderCalResult> trans = transResult.trans(jsonObject, TraderCalResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            traderCalMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("trade_cal").comment("交易日历").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> NameChange(String ts_code,String start,String end) {
        log.info("开始拉取股票曾用名,时间戳：{},代码：{}",System.currentTimeMillis(),ts_code);
        NameChangeParams nameChangeParams = NameChangeParams.builder().ts_code(ts_code).start_date(start).end_date(end).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("namechange").params(nameChangeParams.toJSONObject()).fields(new NameChangeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<NameChangeResult> trans = transResult.trans(jsonObject, NameChangeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            nameChangeMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("namechange").comment("股票曾用名").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> HsConst(String hs_type) {
        log.info("开始拉取沪股通、深股通成分数据,时间戳：{},类型：{}",System.currentTimeMillis(),hs_type);
        HsConstParams hsConstParams = HsConstParams.builder().hs_type(hs_type).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("hs_const").params(hsConstParams.toJSONObject()).fields(new HsConstResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HsConstResult> trans = transResult.trans(jsonObject, HsConstResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            if (SH.equals(hs_type)){
                hsConstMapper.h_insert(trans);
            }else {
                hsConstMapper.s_insert(trans);
            }
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("hs_const").comment("沪股通、深股通成分").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> StockCompany(String exchange) {
        log.info("开始拉取上市公司基本信息,时间戳：{}",System.currentTimeMillis());
        StockCompanyParams companyParams = StockCompanyParams.builder().exchange(exchange).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stock_company").params(companyParams.toJSONObject()).fields(new StockCompanyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StockCompanyResult> trans = transResult.trans(jsonObject, StockCompanyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stockComponyMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("stock_company").comment("上市公司基本信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> StkManagers(String ts_code,String start) {
        log.info("开始拉取上市公司管理层信息,时间戳：{},代码：{},开始时间：{}",System.currentTimeMillis(),ts_code,start);
        StkManagersParams managersParams = StkManagersParams.builder().ts_code(ts_code).start_date(start).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stk_managers").params(managersParams.toJSONObject()).fields(new StkManagersResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkManagersResult> trans = transResult.trans(jsonObject, StkManagersResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stkManagersMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("stk_managers").comment("上市公司管理层信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> StkRewards(String ts_code,String ann_date) {
        log.info("开始拉取管理层薪酬和持股信息,时间戳：{},代码：{},结束时间：{}",System.currentTimeMillis(),ts_code,ann_date);
        StkRewardsParams rewardsParams = StkRewardsParams.builder().ts_code(ts_code).ann_date(ann_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stk_rewards").params(rewardsParams.toJSONObject()).fields(new StkRewardsResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkRewardsResult> trans = transResult.trans(jsonObject, StkRewardsResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            stkRewardsMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("stk_rewards").comment("管理层薪酬和持股信息").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> NewShare(String start,String end) {
        log.info("开始拉取IPO新股列表信息,时间戳：{},开始时间：{},结束时间：{}",System.currentTimeMillis(),start,end);
        NewShareParams newShareParams = NewShareParams.builder().start_date(start).end_date(end).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("new_share").params(newShareParams.toJSONObject()).fields(new NewShareResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<NewShareResult> trans = transResult.trans(jsonObject, NewShareResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
            newShareMapper.insert(trans);
        }else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api("new_share").comment("IPO新股列表").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }
}
