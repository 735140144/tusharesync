package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.*;
import luckyboy.params.*;
import luckyboy.result.*;
import luckyboy.service.MarketDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class MarketDataServiceImpl implements MarketDataService {
    @Resource
    private DailyWeeklyMonthlyMapper dailyWeeklyMonthlyMapper;

    @Resource
    private AdjFactorMapper adjFactorMapper;

    @Resource
    private SuspendDMapper suspendDMapper;

    @Resource
    private DailyBasicMapper dailyBasicMapper;

    @Resource
    private MoneyFlowMapper moneyFlowMapper;

    @Resource
    private StkLimitMapper stkLimitMapper;

    @Resource
    private MoneyflowHsgtMapper moneyflowHsgtMapper;

    @Resource
    private HsgtTop10Mapper hsgtTop10Mapper;

    @Resource
    private GgtTop10Mapper ggtTop10Mapper;

    @Resource
    private GgtDailyMapper ggtDailyMapper;

    @Resource
    private GgtMonthlyMapper ggtMonthlyMapper;

    @Override
    public Result<?> daily(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取日线行情列表,时间戳：{}",System.currentTimeMillis());
        DailyWeeklyMonthlyParams dailyWeeklyMonthlyParams = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("daily").params(dailyWeeklyMonthlyParams.toJSONObject()).fields(new DailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DailyResult> trans = transResult.trans(jsonObject, DailyResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        dailyWeeklyMonthlyMapper.insertDaily(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> weekly(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取周线行情列表,时间戳：{}",System.currentTimeMillis());
        DailyWeeklyMonthlyParams dailyWeeklyMonthlyParams = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("daily").params(dailyWeeklyMonthlyParams.toJSONObject()).fields(new WeeklyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<WeeklyResult> trans = transResult.trans(jsonObject, WeeklyResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        dailyWeeklyMonthlyMapper.insertWeekly(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> monthly(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取月线行情列表,时间戳：{}",System.currentTimeMillis());
        DailyWeeklyMonthlyParams dailyWeeklyMonthlyParams = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("daily").params(dailyWeeklyMonthlyParams.toJSONObject()).fields(new MonthlyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<MonthlyResult> trans = transResult.trans(jsonObject, MonthlyResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        dailyWeeklyMonthlyMapper.insertMonthly(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> adjFactor(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取复权因子列表,时间戳：{}",System.currentTimeMillis());
        AdjFactorParams factorParams = AdjFactorParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("adj_factor").params(factorParams.toJSONObject()).fields(new AdjFactorResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<AdjFactorResult> trans = transResult.trans(jsonObject, AdjFactorResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        adjFactorMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> suspendD(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取每日停复牌信息,时间戳：{}",System.currentTimeMillis());
        SuspendDParams suspendDParams = SuspendDParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("suspend_d").params(suspendDParams.toJSONObject()).fields(new SuspendDResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<SuspendDResult> trans = transResult.trans(jsonObject, SuspendDResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        suspendDMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> daily_basic(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取每日指标信息,时间戳：{}",System.currentTimeMillis());
        DailyBasicParams dailyBasicParams = DailyBasicParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("daily_basic").params(dailyBasicParams.toJSONObject()).fields(new DailyBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DailyBasicResult> trans = transResult.trans(jsonObject, DailyBasicResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        dailyBasicMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> moneyflow(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取个股资金流向信息,时间戳：{}",System.currentTimeMillis());
        MoneyFlowParams moneyFlowParams = MoneyFlowParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("moneyflow").params(moneyFlowParams.toJSONObject()).fields(new MoneyFlowResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<MoneyFlowResult> trans = transResult.trans(jsonObject, MoneyFlowResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        moneyFlowMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> stkLimit(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取每日涨跌停价格信息,时间戳：{}",System.currentTimeMillis());
        StkLimitParams stkLimitParams = StkLimitParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stk_limit").params(stkLimitParams.toJSONObject()).fields(new StkLimitResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StkLimitResult> trans = transResult.trans(jsonObject, StkLimitResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        stkLimitMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> moneyflowHsgt(String trade_date, String start_date, String end_date) {
        log.info("开始拉取沪深港通资金流向信息,时间戳：{}",System.currentTimeMillis());
        MoneyFlowHsgtParams moneyFlowHsgtParams = MoneyFlowHsgtParams.builder().trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("moneyflow_hsgt").params(moneyFlowHsgtParams.toJSONObject()).fields(new MoneyFlowHsgtResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<MoneyFlowHsgtResult> trans = transResult.trans(jsonObject, MoneyFlowHsgtResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        moneyflowHsgtMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> hsgtTop10(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取沪深股通十大成交股信息,时间戳：{}",System.currentTimeMillis());
        HsgtTop10Params hsgtTop10Params = HsgtTop10Params.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("hsgt_top10").params(hsgtTop10Params.toJSONObject()).fields(new HsgtTop10Result().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<HsgtTop10Result> trans = transResult.trans(jsonObject, HsgtTop10Result.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        hsgtTop10Mapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ggtTop10(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取港股通十大成交股信息,时间戳：{}",System.currentTimeMillis());
        GgtTop10Params ggtTop10Params = GgtTop10Params.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("ggt_top10").params(ggtTop10Params.toJSONObject()).fields(new GgtTop10Result().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<GgtTop10Result> trans = transResult.trans(jsonObject, GgtTop10Result.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        ggtTop10Mapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ggtDaily(String trade_date, String start_date, String end_date) {
        log.info("开始拉取港股通每日成交统计信息,时间戳：{}",System.currentTimeMillis());
        GgtDailyParams ggtDailyParams = GgtDailyParams.builder().trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("ggt_daily").params(ggtDailyParams.toJSONObject()).fields(new GgtDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<GgtDailyResult> trans = transResult.trans(jsonObject, GgtDailyResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        ggtDailyMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> ggtMonthly(String month, String start_month, String end_month) {
        log.info("开始拉取港股通每月成交统计信息,时间戳：{}",System.currentTimeMillis());
        GgtMonthlyParams ggtMonthlyParams = GgtMonthlyParams.builder().month(month).start_month(start_month).end_month(end_month).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("ggt_monthly").params(ggtMonthlyParams.toJSONObject()).fields(new GgtMonthlyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<GgtMonthlyResult> trans = transResult.trans(jsonObject, GgtMonthlyResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        ggtMonthlyMapper.insert(trans);
        return Result.ok(jsonObject.getString("msg"));
    }
}
