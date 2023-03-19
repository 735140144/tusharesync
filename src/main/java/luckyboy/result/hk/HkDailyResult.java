package luckyboy.result.hk;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "港股行情")
public class HkDailyResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "开盘价")
    private String open;
    @ExplainAnnotation(comment = "最高价")
    private String high;
    @ExplainAnnotation(comment = "最低价")
    private String low;
    @ExplainAnnotation(comment = "收盘价")
    private String close;
    @ExplainAnnotation(comment = "昨收价")
    private String pre_close;
    @ExplainAnnotation(comment = "涨跌额")
    private String change;
    @ExplainAnnotation(comment = "涨跌幅(%)")
    private String pct_chg;
    @ExplainAnnotation(comment = "成交量(股)")
    private String vol;
    @ExplainAnnotation(comment = "成交额(元)")
    private String amount;
}
