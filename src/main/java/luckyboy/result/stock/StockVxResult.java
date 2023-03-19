package luckyboy.result.stock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "估值因子")
public class StockVxResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "4评级：1(便宜)、2(合理)、3(贵)、4(很贵)")
    private String level1;
    @ExplainAnnotation(comment = "8评级：1,2(便宜)、3,4(合理)、5,6(贵)、7,8(很贵)")
    private String level2;
    @ExplainAnnotation(comment = "估值长优4条线，根据level1的评级，公司上市后每一天的估值评级平均")
    private String vx_life_v_l4;
    @ExplainAnnotation(comment = "估值3优4条线，根据level1的评级")
    private String vx_3excellent_v_l4;
    @ExplainAnnotation(comment = "估值4条线近5季平均，根据level1的评级")
    private String vx_past_5q_avg_l4;
    @ExplainAnnotation(comment = "估值进退步-估值4条线,根据level1的评级")
    private String vx_grow_worse_v_l4;
    @ExplainAnnotation(comment = "估值长优8条线,根据level2的评级")
    private String vx_life_v_l8;
    @ExplainAnnotation(comment = "估值3优8条线,根据level2的评级")
    private String vx_3excellent_v_l8;
    @ExplainAnnotation(comment = "估值8条线近5季平均,根据level2的评级")
    private String vx_past_5q_avg_l8;
    @ExplainAnnotation(comment = "估值进退步-估值8条线,根据level2的评级")
    private String vx_grow_worse_v_l8;
    @ExplainAnnotation(comment = "个股最新估值与亚洲同类股票相较后的标准差")
    private String vxx;
    @ExplainAnnotation(comment = "个股最新估值与亚洲同类股票自己相较后的标准差")
    private String vs;
    @ExplainAnnotation(comment = "个股最新估值与亚洲同类股票主行业相较后的标准差")
    private String vz11;
    @ExplainAnnotation(comment = "个股最新估值与亚洲同类股票次行业相较后的标准差")
    private String vz24;
    @ExplainAnnotation(comment = "个股最新估值与亚洲同类股票市值分类相较后的标准差")
    private String vz_lms;
}
