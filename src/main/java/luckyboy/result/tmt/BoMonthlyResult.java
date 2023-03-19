package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "电影月度票房")
public class BoMonthlyResult extends Formart {
    @ExplainAnnotation(comment = "日期")
    @KeyAnnotation
    @BucketAnnotation
    private String date;
    @ExplainAnnotation(comment = "影片名称")
    @KeyAnnotation
    private String name;
    @ExplainAnnotation(comment = "上映日期")
    private String list_date;
    @ExplainAnnotation(comment = "平均票价")
    private String avg_price;
    @ExplainAnnotation(comment = "当月票房（万）")
    private String month_amount;
    @ExplainAnnotation(comment = "月内天数")
    private String list_day;
    @ExplainAnnotation(comment = "场均人次")
    private String p_pc;
    @ExplainAnnotation(comment = "口碑指数")
    private String wom_index;
    @ExplainAnnotation(comment = "月度占比（%）")
    private String m_ratio;
    @ExplainAnnotation(comment = "排名")
    private String rank;
}
