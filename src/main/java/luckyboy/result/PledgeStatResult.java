package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;

@Data
public class PledgeStatResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "截止日期")
    @KeyAnnotation
    private String end_date;
    @ExplainAnnotation(comment = "质押次数")
    private String pledge_count;
    @ExplainAnnotation(comment = "无限售股质押数量（万）")
    private String unrest_pledge;
    @ExplainAnnotation(comment = "限售股份质押数量（万）")
    private String rest_pledge;
    @ExplainAnnotation(comment = "总股本")
    private String total_share;
    @ExplainAnnotation(comment = "质押比例")
    private String pledge_ratio;

}
