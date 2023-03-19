package luckyboy.result.us;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "美股行情")
public class UsTradecalResult extends Formart {
    @ExplainAnnotation(comment = "日历日期")
    @KeyAnnotation
    @BucketAnnotation
    private String cal_date;
    @ExplainAnnotation(comment = "是否交易 '0'休市 '1'交易")
    private String is_open;
    @ExplainAnnotation(comment = "上一个交易日")
    private String pretrade_date;
}
