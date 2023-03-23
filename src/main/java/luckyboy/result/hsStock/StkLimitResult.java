package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "每日涨跌停价格")
public class StkLimitResult extends Formart {

    @ExplainAnnotation(comment = " 交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;

    @ExplainAnnotation(comment = "TS股票代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "昨日收盘价")
    private String pre_close;

    @ExplainAnnotation(comment = "涨停价")
    private String up_limit;

    @ExplainAnnotation(comment = "跌停价")
    private String down_limit;
}
