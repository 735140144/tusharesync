package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "月线行情")
public class MonthlyResult extends Formart {

    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = " 交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;

    @ExplainAnnotation(comment = " 月开盘价")
    private String open;

    @ExplainAnnotation(comment = " 月最高价")
    private String high;

    @ExplainAnnotation(comment = " 月最低价")
    private String low;

    @ExplainAnnotation(comment = " 月收盘价")
    private String close;

    @ExplainAnnotation(comment = " 上一月收价")
    private String pre_close;

    @ExplainAnnotation(comment = " 月涨跌额")
    private String change;

    @ExplainAnnotation(comment = " 月涨跌幅 （未复权)")
    private String pct_chg;

    @ExplainAnnotation(comment = " 月成交量 （手）")
    private String vol;

    @ExplainAnnotation(comment = " 月成交额 （千元）")
    private String amount;
}
