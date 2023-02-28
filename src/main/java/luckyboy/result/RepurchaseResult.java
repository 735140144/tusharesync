package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class RepurchaseResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "截止日期")
    private String end_date;
    @ExplainAnnotation(comment = "进度")
    private String proc;
    @ExplainAnnotation(comment = "过期日期")
    private String exp_date;
    @ExplainAnnotation(comment = "回购数量")
    private String vol;
    @ExplainAnnotation(comment = "回购金额")
    private String amount;
    @ExplainAnnotation(comment = "回购最高价")
    private String high_limit;
    @ExplainAnnotation(comment = "回购最低价")
    private String low_limit;
}
