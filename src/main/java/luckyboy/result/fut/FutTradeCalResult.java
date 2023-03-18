package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FutTradeCalResult extends Formart {
    @ExplainAnnotation(comment = "交易所")
    @KeyAnnotation
    @BucketAnnotation
    private String exchange;
    @ExplainAnnotation(comment = "日历日期")
    @KeyAnnotation
    private String cal_date;
    @ExplainAnnotation(comment = "是否交易 0休市 1交易")
    private String is_open;
    @ExplainAnnotation(comment = "上一个交易日")
    private String pretrade_date;
}
