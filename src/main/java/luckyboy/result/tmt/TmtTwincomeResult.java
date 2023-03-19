package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "台湾电子产业月营收")
public class TmtTwincomeResult extends Formart {
    @ExplainAnnotation(comment = "报告期")
    @KeyAnnotation
    @BucketAnnotation
    private String date;
    @ExplainAnnotation(comment = "产品代码")
    @KeyAnnotation
    private String item;
    @ExplainAnnotation(comment = "月度收入")
    private String op_income;
}
