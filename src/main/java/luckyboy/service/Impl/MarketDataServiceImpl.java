package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.AdjFactorMapper;
import luckyboy.mapper.DailyWeeklyMonthlyMapper;
import luckyboy.mapper.SuspendDMapper;
import luckyboy.params.AdjFactorParams;
import luckyboy.params.DailyWeeklyMonthlyParams;
import luckyboy.params.SuspendDParams;
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

    @Override
    public Result<?> daily(String ts_code, String trade_date, String start_date, String end_date) {
        log.info("开始拉取日线行情列表,时间戳：{}",System.currentTimeMillis());
        DailyWeeklyMonthlyParams dailyWeeklyMonthlyParams = DailyWeeklyMonthlyParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("daily").params(dailyWeeklyMonthlyParams.toJSONObject()).fields(new DailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<DailyResult> trans = transResult.trans(jsonObject, DailyResult.class);
        log.info("开始写入数据库，时间戳：{}",System.currentTimeMillis());
        dailyWeeklyMonthlyMapper.insertDaily(trans);
        return Result.ok();
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
        return Result.ok();
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
        return Result.ok();
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
        return Result.ok();
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
        return Result.ok();
    }

    @Override
    public Result<?> daily_basic(String ts_code, String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> moneyflow(String ts_code, String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> stkLimit(String ts_code, String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> moneyflowHsgt(String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> hsgtTop10(String ts_code, String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> ggtTop10(String ts_code, String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> ggtDaily(String trade_date, String start_date, String end_date) {
        return null;
    }

    @Override
    public Result<?> ggtMonthly(String month, String start_month, String end_month) {
        return null;
    }
}
