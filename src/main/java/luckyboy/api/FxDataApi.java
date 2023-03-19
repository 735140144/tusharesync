package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "外汇数据",tags = "外汇数据")
@RestController
@RequestMapping(value = "/data/fx",method = RequestMethod.GET)
public interface FxDataApi {

    @ApiOperation("外汇基础信息（海外）")
    @RequestMapping("/fx_obasic")
    Result<?> fx_obasic(@Param("exchange") String exchange,@Param("classify") String classify,@Param("ts_code") String ts_code);

    @ApiOperation("外汇日线行情")
    @RequestMapping("/fx_daily")
    Result<?> fx_daily(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("exchange") String exchange);

}