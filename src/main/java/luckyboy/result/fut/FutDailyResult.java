package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "期货日线行情")
public class FutDailyResult extends Formart {
    @ExplainAnnotation(comment = "合约代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "昨收盘价")
    private String pre_close;
    @ExplainAnnotation(comment = "昨结算价")
    private String pre_settle;
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
    @ExplainAnnotation(comment = "涨跌1 收盘价-昨结算价")
    private String change1;
    @ExplainAnnotation(comment = "涨跌2 结算价-昨结算价")
    private String change2;
    @ExplainAnnotation(comment = "成交量(手)")
    private String vol;
    @ExplainAnnotation(comment = "成交金额(万元)")
    private String amount;
    @ExplainAnnotation(comment = "持仓量(手)")
    private String oi;
    @ExplainAnnotation(comment = "持仓量变化")
    private String oi_chg;
    @ExplainAnnotation(comment = "交割结算价")
    private String delv_settle;
}
