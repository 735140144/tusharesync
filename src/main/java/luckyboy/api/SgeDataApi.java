package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.sge.SgeBasicParams;
import luckyboy.params.sge.SgeDailyParams;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "现货数据",tags = "现货数据")
@RestController
@RequestMapping(value = "/data/sge",method = RequestMethod.GET)
public interface SgeDataApi {
    @ApiOperation("黄金现货基础信息")
    @RequestMapping("/sge_basic")
    Result<?> sge_basic(@Param("ts_code")String ts_code);

    @ApiOperation("黄金现货日行情")
    @RequestMapping("/sge_daily")
    Result<?> sge_daily(@Param("ts_code") String ts_code,@Param("trade_date") String trade_date,@Param("start_date")String start_date,@Param("end_date")String end_date);
}
