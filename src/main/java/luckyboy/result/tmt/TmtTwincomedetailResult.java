package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "台湾电子产业月营收明细")
public class TmtTwincomedetailResult extends Formart {
    @ExplainAnnotation(comment = "报告期")
    @KeyAnnotation
    @BucketAnnotation
    private String date;
    @ExplainAnnotation(comment = "产品代码")
    @KeyAnnotation
    private String item;
    @ExplainAnnotation(comment = "公司代码")
    private String symbol;
    @ExplainAnnotation(comment = "月度营收")
    private String op_income;
    @ExplainAnnotation(comment = "合并月度营收（默认不展示）")
    private String consop_income;
}
