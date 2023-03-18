package luckyboy.result.sge;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class SgeDailyResult extends Formart {
    @ExplainAnnotation(comment = "现货合约代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日")
    @KeyAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "收盘点(元/克)")
    private String close;
    @ExplainAnnotation(comment = "开盘点(元/克)")
    private String open;
    @ExplainAnnotation(comment = "最高点(元/克)")
    private String high;
    @ExplainAnnotation(comment = "最低点(元/克)")
    private String low;
    @ExplainAnnotation(comment = "加权平均价(元/克)")
    private String price_avg;
    @ExplainAnnotation(comment = "涨跌点位(元/克)")
    private String change;
    @ExplainAnnotation(comment = "涨跌幅")
    private String pct_change;
    @ExplainAnnotation(comment = "成交量(千克)")
    private String vol;
    @ExplainAnnotation(comment = "成交金额(元)")
    private String amount;
    @ExplainAnnotation(comment = "市场持仓")
    private String oi;
    @ExplainAnnotation(comment = "交收量")
    private String settle_vol;
    @ExplainAnnotation(comment = "持仓方向")
    private String settle_dire;
}
