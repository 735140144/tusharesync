package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class IndexMonthlyResult extends Formart {
    @ExplainAnnotation(comment = "TS指数代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "收盘点位")
    private String close;
    @ExplainAnnotation(comment = "开盘点位")
    private String open;
    @ExplainAnnotation(comment = "最高点位")
    private String high;
    @ExplainAnnotation(comment = "最低点位")
    private String low;
    @ExplainAnnotation(comment = "昨日收盘点")
    private String pre_close;
    @ExplainAnnotation(comment = "涨跌点")
    private String change;
    @ExplainAnnotation(comment = "涨跌幅（%）")
    private String pct_chg;
    @ExplainAnnotation(comment = "成交量（手）")
    private String vol;
    @ExplainAnnotation(comment = "成交额（千元）")
    private String amount;
}
