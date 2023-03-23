package luckyboy.result.opt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "期权日线行情")
public class OptDailyResult extends Formart {
    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "交易市场")
    private String exchange;
    @ExplainAnnotation(comment = "昨结算价")
    private String pre_settle;
    @ExplainAnnotation(comment = "前收盘价")
    private String pre_close;
    @ExplainAnnotation(comment = "开盘价")
    private String open;
    @ExplainAnnotation(comment = "最高价")
    private String high;
    @ExplainAnnotation(comment = "最低价")
    private String low;
    @ExplainAnnotation(comment = "收盘价")
    private String close;
    @ExplainAnnotation(comment = "结算价")
    private String settle;
    @ExplainAnnotation(comment = "成交量(手)")
    private String vol;
    @ExplainAnnotation(comment = "成交金额(万元)")
    private String amount;
    @ExplainAnnotation(comment = "持仓量(手)")
    private String oi;
}
