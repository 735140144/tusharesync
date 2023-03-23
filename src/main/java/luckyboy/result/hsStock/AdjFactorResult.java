package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "复权因子列表")
public class AdjFactorResult extends Formart {

    @ExplainAnnotation(comment = " 股票代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = " 交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;

    @ExplainAnnotation(comment = " 复权因子")
    private String adj_factor;
}
