package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "初始化",tags = "初始化")
@RestController
@RequestMapping(value = "/data/init",method = RequestMethod.GET)
public interface InitApi {
    @ApiOperation("指数基本信息")
    @RequestMapping("/table")
    Result<?> initSql(@Param("dbtype") String dbtype);

    @ApiOperation("指数基本信息")
    @RequestMapping("/data")
    Result<?> initData();
}
