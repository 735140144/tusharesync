package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "美股数据",tags = "美股数据")
@RestController
@RequestMapping(value = "/data/us",method = RequestMethod.GET)
public interface UsDataApi {

    @ApiOperation("美股交易日历")
    @RequestMapping("/us_daily")
    Result<?> us_daily(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("美股列表")
    @RequestMapping("/us_basic")
    Result<?> us_basic(@Param("ts_code") String ts_code,@Param("classify") String classify,@Param("offset") String offset,@Param("limit") String limit);

    @ApiOperation("美股行情")
    @RequestMapping("/us_tradecal")
    Result<?> us_tradecal(@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("is_open") String is_open);

}