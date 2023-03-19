package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "港股数据",tags = "港股数据")
@RestController
@RequestMapping(value = "/data/hk",method = RequestMethod.GET)
public interface HkDataApi {

    @ApiOperation("港股列表")
    @RequestMapping("/hk_basic")
    Result<?> hk_basic(@Param("ts_code") String ts_code,@Param("list_status") String list_status);

    @ApiOperation("港股行情")
    @RequestMapping("/hk_daily")
    Result<?> hk_daily(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("港股交易日历")
    @RequestMapping("/hk_tradecal")
    Result<?> hk_tradecal(@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("is_open") String is_open);

    @ApiOperation("港股分钟行情")
    @RequestMapping("/hk_mins")
    Result<?> hk_mins(@Param("ts_code") String ts_code,@Param("freq") String freq,@Param("start_date") String start_date,@Param("end_date") String end_date);

}