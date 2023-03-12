package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class BrokerRecommendResult extends Formart {
    @ExplainAnnotation(comment = "月度")
    @KeyAnnotation
    @BucketAnnotation
    private String month;
    @ExplainAnnotation(comment = "券商")
    @KeyAnnotation
    private String broker;
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票简称")
    private String name;
}
