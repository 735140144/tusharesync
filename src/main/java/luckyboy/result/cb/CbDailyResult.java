package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "可转债行情")
public class CbDailyResult extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "昨收盘价(元)")
    private String pre_close;
    @ExplainAnnotation(comment = "开盘价(元)")
    private String open;
    @ExplainAnnotation(comment = "最高价(元)")
    private String high;
    @ExplainAnnotation(comment = "最低价(元)")
    private String low;
    @ExplainAnnotation(comment = "收盘价(元)")
    private String close;
    @ExplainAnnotation(comment = "涨跌(元)")
    private String change;
    @ExplainAnnotation(comment = "涨跌幅(%)")
    private String pct_chg;
    @ExplainAnnotation(comment = "成交量(手)")
    private String vol;
    @ExplainAnnotation(comment = "成交金额(万元)")
    private String amount;
    @ExplainAnnotation(comment = "纯债价值")
    private String bond_value;
    @ExplainAnnotation(comment = "纯债溢价率(%)")
    private String bond_over_rate;
    @ExplainAnnotation(comment = "转股价值")
    private String cb_value;
    @ExplainAnnotation(comment = "转股溢价率(%)")
    private String cb_over_rate;
}
