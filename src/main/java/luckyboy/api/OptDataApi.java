package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "期权数据",tags = "期权数据")
@RestController
@RequestMapping(value = "/data/opt",method = RequestMethod.GET)
public interface OptDataApi {

    @ApiOperation("期权合约信息")
    Result<?> opt_basic(@Param("ts_code")String ts_code,@Param("exchange")String exchange,@Param("call_put")String call_put);

    @ApiOperation("期权日线行情")
    Result<?> opt_daily(@Param("ts_code")String ts_code,@Param("trade_date")String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date,@Param("exchange")String exchange);
}