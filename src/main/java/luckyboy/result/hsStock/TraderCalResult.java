package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;

@Data
@ResultComment(comment = "交易日历")
public class TraderCalResult extends Formart {

    @ExplainAnnotation(comment = "交易所 SSE上交所 SZSE深交所")
    @KeyAnnotation
    private String exchange;

    @ExplainAnnotation(comment = "日历日期")
    @KeyAnnotation
    @BucketAnnotation
    private String cal_date;

    @ExplainAnnotation(comment = "	是否交易 0休市 1交易")
    private String is_open;

    @ExplainAnnotation(comment = "上一个交易日")
    private String pretrade_date;
}
