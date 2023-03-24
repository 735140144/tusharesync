package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.tmt.*;
import luckyboy.params.tmt.*;
import luckyboy.result.tmt.*;
import luckyboy.service.TmtDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class TmtDataServiceImpl implements TmtDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private BoWeeklyMapper boWeeklyMapper;
	@Resource
	private TmtTwincomedetailMapper tmtTwincomedetailMapper;
	@Resource
	private BoDailyMapper boDailyMapper;
	@Resource
	private TeleplayRecordMapper teleplayRecordMapper;
	@Resource
	private BoMonthlyMapper boMonthlyMapper;
	@Resource
	private FilmRecordMapper filmRecordMapper;
	@Resource
	private BoCinemaMapper boCinemaMapper;
	@Resource
	private TmtTwincomeMapper tmtTwincomeMapper;
    @Override
    public Result<?> bo_weekly(BoWeeklyParams params) {
        log.info("开始拉取电影周度票房,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BoWeeklyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BoWeeklyResult> trans = transResult.trans(jsonObject, BoWeeklyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            boWeeklyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("电影周度票房").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> tmt_twincomedetail(TmtTwincomedetailParams params) {
        log.info("开始拉取台湾电子产业月营收明细,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new TmtTwincomedetailResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TmtTwincomedetailResult> trans = transResult.trans(jsonObject, TmtTwincomedetailResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            tmtTwincomedetailMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("台湾电子产业月营收明细").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> bo_daily(BoDailyParams params) {
        log.info("开始拉取电影日度票房,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BoDailyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BoDailyResult> trans = transResult.trans(jsonObject, BoDailyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            boDailyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("电影日度票房").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> teleplay_record(TeleplayRecordParams params) {
        log.info("开始拉取全国拍摄制作电视剧备案公示数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new TeleplayRecordResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TeleplayRecordResult> trans = transResult.trans(jsonObject, TeleplayRecordResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            teleplayRecordMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("全国拍摄制作电视剧备案公示数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> bo_monthly(BoMonthlyParams params) {
        log.info("开始拉取电影月度票房,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BoMonthlyResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BoMonthlyResult> trans = transResult.trans(jsonObject, BoMonthlyResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            boMonthlyMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("电影月度票房").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> film_record(FilmRecordParams params) {
        log.info("开始拉取全国电影剧本备案数据,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new FilmRecordResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<FilmRecordResult> trans = transResult.trans(jsonObject, FilmRecordResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            filmRecordMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("全国电影剧本备案数据").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> bo_cinema(BoCinemaParams params) {
        log.info("开始拉取影院每日票房,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new BoCinemaResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<BoCinemaResult> trans = transResult.trans(jsonObject, BoCinemaResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            boCinemaMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("影院每日票房").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> tmt_twincome(TmtTwincomeParams params) {
        log.info("开始拉取台湾电子产业月营收,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new TmtTwincomeResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<TmtTwincomeResult> trans = transResult.trans(jsonObject, TmtTwincomeResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            tmtTwincomeMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("tmt").params(JSONObject.toJSONString(params)).api(apiName).comment("台湾电子产业月营收").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}