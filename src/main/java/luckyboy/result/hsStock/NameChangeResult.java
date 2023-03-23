package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;

@Data
@ResultComment(comment = "股票曾用名")
public class NameChangeResult extends Formart {

     @ExplainAnnotation(comment = "TS代码")
     @KeyAnnotation
     @BucketAnnotation
    private String ts_code;

     @ExplainAnnotation(comment = "证券名称")
    private String name;

     @ExplainAnnotation(comment = "开始日期")
    private String start_date;

     @ExplainAnnotation(comment = "结束日期")
    private String end_date;

     @ExplainAnnotation(comment = "公告日期")
    private String ann_date;

     @ExplainAnnotation(comment = "变更原因")
    private String change_reason;
}
