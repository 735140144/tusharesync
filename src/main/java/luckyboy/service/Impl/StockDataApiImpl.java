package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.StockDataApi;
import luckyboy.params.stock.*;
import luckyboy.service.StockDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StockDataApiImpl implements StockDataApi {
    @Autowired
    private StockDataService stockDataService;

    @Override
    public Result<?> stock_vx(String ts_code,String trade_date,String start_date,String end_date) {
        StockVxParams build = StockVxParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return stockDataService.stock_vx(build);
    }

    @Override
    public Result<?> stock_mx(String ts_code,String trade_date,String start_date,String end_date) {
        StockMxParams build = StockMxParams.builder().ts_code(ts_code).trade_date(trade_date).start_date(start_date).end_date(end_date).build();
        return stockDataService.stock_mx(build);
    }

}