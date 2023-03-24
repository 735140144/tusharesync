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
@RequestMapping(value = "/data/news",method = RequestMethod.GET)
public interface NewsDataApi {

    @ApiOperation("新闻快讯")
    @RequestMapping("/news")
    Result<?> news(@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("src") String src);

    @ApiOperation("新闻联播")
    @RequestMapping("/cctv_news")
    Result<?> cctv_news(@Param("date") String date);

}