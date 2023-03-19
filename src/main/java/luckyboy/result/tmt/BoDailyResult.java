package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "电影日度票房")
public class BoDailyResult extends Formart {
    @ExplainAnnotation(comment = "日期")
    @KeyAnnotation
    @BucketAnnotation
    private String date;
    @ExplainAnnotation(comment = "影片名称")
    @KeyAnnotation
    private String name;
    @ExplainAnnotation(comment = "平均票价")
    private String avg_price;
    @ExplainAnnotation(comment = "当日票房（万）")
    private String day_amount;
    @ExplainAnnotation(comment = "累计票房（万）")
    private String total;
    @ExplainAnnotation(comment = "上映天数")
    private String list_day;
    @ExplainAnnotation(comment = "场均人次")
    private String p_pc;
    @ExplainAnnotation(comment = "口碑指数")
    private String wom_index;
    @ExplainAnnotation(comment = "环比变化 （%）")
    private String up_ratio;
    @ExplainAnnotation(comment = "排名")
    private String rank;
}
