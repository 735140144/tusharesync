package luckyboy.service.Impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.common.TusharePostParam;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.mapper.stock.*;
import luckyboy.params.stock.*;
import luckyboy.result.stock.*;
import luckyboy.service.StockDataService;
import luckyboy.util.Result;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class StockDataServiceImpl implements StockDataService {
	@Resource
	private FailLogMapper failLogMapper;
	@Resource
	private StockVxMapper stockVxMapper;
	@Resource
	private StockMxMapper stockMxMapper;
    @Override
    public Result<?> stock_vx(StockVxParams params) {
        log.info("开始拉取估值因子,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new StockVxResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StockVxResult> trans = transResult.trans(jsonObject, StockVxResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            stockVxMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("估值因子").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

    @Override
    public Result<?> stock_mx(StockMxParams params) {
        log.info("开始拉取动能因子,时间戳：{}", System.currentTimeMillis());
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new StockMxResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        List<StockMxResult> trans = transResult.trans(jsonObject, StockMxResult.class);
        if (trans.size() > 0) {
            log.info("开始写入数据库，时间戳：{}", System.currentTimeMillis());
            stockMxMapper.insert(trans);
        } else {
            log.info("未获取到数据！");
            failLogMapper.insert(FailLog.builder().api(apiName).comment("动能因子").build());
        }
        return Result.ok(jsonObject.getString("msg"));
    }

}