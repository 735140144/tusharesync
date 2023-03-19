package luckyboy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import luckyboy.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "TMT行业数据",tags = "TMT行业数据")
@RestController
@RequestMapping(value = "/data/tmt",method = RequestMethod.GET)
public interface TmtDataApi {

    @ApiOperation("电影周度票房")
    @RequestMapping("/bo_weekly")
    Result<?> bo_weekly(@Param("date") String date);

    @ApiOperation("台湾电子产业月营收明细")
    @RequestMapping("/tmt_twincomedetail")
    Result<?> tmt_twincomedetail(@Param("date") String date,@Param("item") String item,@Param("symbol") String symbol,@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("source") String source);

    @ApiOperation("电影日度票房")
    @RequestMapping("/bo_daily")
    Result<?> bo_daily(@Param("date") String date);

    @ApiOperation("全国拍摄制作电视剧备案公示数据")
    @RequestMapping("/teleplay_record")
    Result<?> teleplay_record(@Param("report_date") String report_date,@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("org") String org,@Param("name") String name);

    @ApiOperation("电影月度票房")
    @RequestMapping("/bo_monthly")
    Result<?> bo_monthly(@Param("date") String date);

    @ApiOperation("全国电影剧本备案数据")
    @RequestMapping("/film_record")
    Result<?> film_record(@Param("ann_date") String ann_date,@Param("start_date") String start_date,@Param("end_date") String end_date);

    @ApiOperation("影院每日票房")
    @RequestMapping("/bo_cinema")
    Result<?> bo_cinema(@Param("date") String date);

    @ApiOperation("台湾电子产业月营收")
    @RequestMapping("/tmt_twincome")
    Result<?> tmt_twincome(@Param("date") String date,@Param("item") String item,@Param("start_date") String start_date,@Param("end_date") String end_date);

}