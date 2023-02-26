package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
public class PledgeStatResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    private String ts_code;
    @ExplainAnnotation(comment = "截止日期")
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
