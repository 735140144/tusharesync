package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "指数成分和权重")
public class IndexWeightResult extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    @KeyAnnotation
    private String index_code;
    @ExplainAnnotation(comment = "成分代码")
    @KeyAnnotation
    private String con_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "权重")
    private String weight;
}
