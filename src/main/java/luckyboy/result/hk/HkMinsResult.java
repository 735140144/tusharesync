package luckyboy.result.hk;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "港股分钟行情")
public class HkMinsResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易时间")
    @KeyAnnotation
    private String trade_time;
    @ExplainAnnotation(comment = "开盘价")
    private String open;
    @ExplainAnnotation(comment = "收盘价")
    private String close;
    @ExplainAnnotation(comment = "最高价")
    private String high;
    @ExplainAnnotation(comment = "最低价")
    private String low;
    @ExplainAnnotation(comment = "成交量")
    private String vol;
    @ExplainAnnotation(comment = "成交金额")
    private String amount;
}
