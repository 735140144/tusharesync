package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FutMappingResult extends Formart {
    @ExplainAnnotation(comment = "连续合约代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "起始日期")
    @KeyAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "期货合约代码")
    private String mapping_ts_code;
}
