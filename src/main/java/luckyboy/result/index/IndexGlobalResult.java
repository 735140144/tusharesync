package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class IndexGlobalResult extends Formart {
    @ExplainAnnotation(comment = "TS指数代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "开盘点位")
    private String open;
    @ExplainAnnotation(comment = "收盘点位")
    private String close;
    @ExplainAnnotation(comment = "最高点位")
    private String high;
    @ExplainAnnotation(comment = "最低点位")
    private String low;
    @ExplainAnnotation(comment = "昨日收盘点")
    private String pre_close;
    @ExplainAnnotation(comment = "涨跌点位")
    private String change;
    @ExplainAnnotation(comment = "涨跌幅")
    private String pct_chg;
    @ExplainAnnotation(comment = "振幅")
    private String swing;
    @ExplainAnnotation(comment = "成交量 （大部分无此项数据）")
    private String vol;
    @ExplainAnnotation(comment = "成交额 （大部分无此项数据）")
    private String amount;

}
