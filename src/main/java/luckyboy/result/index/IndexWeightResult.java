package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
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
