package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class MarginTargetResult extends Formart {
    @ExplainAnnotation(comment = "标的代码")
    private String ts_code;
    @ExplainAnnotation(comment = "标的类型：B买入标的 S卖出标的  ")
    private String mg_type;
    @ExplainAnnotation(comment = "最新标记：Y是 N否")
    private String is_new;
    @ExplainAnnotation(comment = "纳入日期")
    private String in_date;
    @ExplainAnnotation(comment = "剔除日期")
    private String out_date;
    @ExplainAnnotation(comment = "公布日期")
    private String ann_date;
}