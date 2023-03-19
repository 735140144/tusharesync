package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "影院每日票房")
public class BoCinemaResult extends Formart {
    @ExplainAnnotation(comment = "日期")
    @KeyAnnotation
    @BucketAnnotation
    private String date;
    @ExplainAnnotation(comment = "影院名称")
    @KeyAnnotation
    private String c_name;
    @ExplainAnnotation(comment = "观众人数")
    private String aud_count;
    @ExplainAnnotation(comment = "上座率")
    private String att_ratio;
    @ExplainAnnotation(comment = "当日票房")
    private String day_amount;
    @ExplainAnnotation(comment = "当日场次")
    private String day_showcount;
    @ExplainAnnotation(comment = "场均票价（元）")
    private String avg_price;
    @ExplainAnnotation(comment = "场均人次")
    private String p_pc;
    @ExplainAnnotation(comment = "排名")
    private String rank;
}
