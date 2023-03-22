package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "财报披露计划")
public class DisclosureDateResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "最新披露公告日")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "报告期")
    private String end_date;
    @ExplainAnnotation(comment = "预计披露日期")
    private String pre_date;
    @ExplainAnnotation(comment = "实际披露日期")
    private String actual_date;
    @ExplainAnnotation(comment = "披露日期修正记录")
    private String modify_date;
}
