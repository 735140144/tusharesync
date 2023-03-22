package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "融资融券标的")
public class MarginTargetResult extends Formart {
    @ExplainAnnotation(comment = "标的代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公布日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "标的类型：B买入标的 S卖出标的  ")
    private String mg_type;
    @ExplainAnnotation(comment = "最新标记：Y是 N否")
    private String is_new;
    @ExplainAnnotation(comment = "纳入日期")
    private String in_date;
    @ExplainAnnotation(comment = "剔除日期")
    private String out_date;

}
