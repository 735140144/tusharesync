package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.news.*;
import luckyboy.params.news.*;
import luckyboy.result.news.*;
import luckyboy.service.NewsDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class NewsDataServiceImpl implements NewsDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private NewsMapper newsMapper;
	@Resource
	private CctvNewsMapper cctvNewsMapper;
    @Override
    public Result<?> news(NewsParams params) {
        log.info("开始拉取新闻快讯,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new NewsResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<NewsResult> trans = transResult.trans(jsonObject, NewsResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            newsMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("market").params(JSONObject.toJSONString(params)).api(apiName).comment("新闻快讯").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> cctv_news(CctvNewsParams params) {
        log.info("开始拉取新闻联播,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new CctvNewsResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<CctvNewsResult> trans = transResult.trans(jsonObject, CctvNewsResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            cctvNewsMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().pkg("market").params(JSONObject.toJSONString(params)).api(apiName).comment("新闻联播").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}