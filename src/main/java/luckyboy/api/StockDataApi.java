package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "",tags = "")
@RestController
@RequestMapping(value = "/data/stock",method = RequestMethod.GET)
public interface StockDataApi {

    @ApiOperation("估值因子")
    @RequestMapping("/stock_vx")
    Result<?> stock_vx(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("动能因子")
    @RequestMapping("/stock_mx")
    Result<?> stock_mx(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

}