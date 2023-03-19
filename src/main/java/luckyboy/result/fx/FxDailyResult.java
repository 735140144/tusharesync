package luckyboy.result.fx;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "外汇日线行情")
public class FxDailyResult extends Formart {
    @ExplainAnnotation(comment = "外汇代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "买入开盘价")
    private String bid_open;
    @ExplainAnnotation(comment = "买入收盘价")
    private String bid_close;
    @ExplainAnnotation(comment = "买入最高价")
    private String bid_high;
    @ExplainAnnotation(comment = "买入最低价")
    private String bid_low;
    @ExplainAnnotation(comment = "卖出开盘价")
    private String ask_open;
    @ExplainAnnotation(comment = "卖出收盘价")
    private String ask_close;
    @ExplainAnnotation(comment = "卖出最高价")
    private String ask_high;
    @ExplainAnnotation(comment = "卖出最低价")
    private String ask_low;
    @ExplainAnnotation(comment = "报价笔数")
    private String tick_qty;
    @ExplainAnnotation(comment = "交易商")
    private String exchange;
}
