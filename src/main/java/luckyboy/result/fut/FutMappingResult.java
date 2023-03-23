package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "期货主力与连续合约")
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
