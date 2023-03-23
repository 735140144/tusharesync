package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "基金规模数据")
public class FundShareResult extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易（变动）日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "基金份额")
    private String fd_share;
}
