package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "日线行情")
public class DailyResult extends Formart {

    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;

    @ExplainAnnotation(comment = "交易日期")
    private String trade_date;

    @ExplainAnnotation(comment = "开盘价")
    private String open;

    @ExplainAnnotation(comment = "最高价")
    private String high;

    @ExplainAnnotation(comment = "最低价")
    private String low;

    @ExplainAnnotation(comment = "收盘价")
    private String close;

    @ExplainAnnotation(comment = "昨收价(前复权)")
    private String pre_close;

    @ExplainAnnotation(comment = "涨跌额")
    private String change;

    @ExplainAnnotation(comment = "涨跌幅 （未复权)")
    private String pct_chg;

    @ExplainAnnotation(comment = "成交量 （手）")
    private String vol;

    @ExplainAnnotation(comment = "成交额 （千元）")
    private String amount;
}
