package luckyboy.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.params.sge.SgeBasicParams;
import luckyboy.params.sge.SgeDailyParams;
import luckyboy.util.Result;

@Api(value = "现货数据",tags = "现货数据")
public interface SgeDataService {
    @ApiOperation("黄金现货基础信息")
    Result<?> sge_basic(SgeBasicParams params);

    @ApiOperation("黄金现货日行情")
    Result<?> sge_daily(SgeDailyParams params);
}
