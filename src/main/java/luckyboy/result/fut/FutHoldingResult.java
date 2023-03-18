package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FutHoldingResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "合约代码或类型")
    @KeyAnnotation
    private String symbol;
    @ExplainAnnotation(comment = "期货公司会员简称")
    @KeyAnnotation
    private String broker;
    @ExplainAnnotation(comment = "成交量")
    private String vol;
    @ExplainAnnotation(comment = "成交量变化")
    private String vol_chg;
    @ExplainAnnotation(comment = "持买仓量")
    private String long_hld;
    @ExplainAnnotation(comment = "持买仓量变化")
    private String long_chg;
    @ExplainAnnotation(comment = "持卖仓量")
    private String short_hld;
    @ExplainAnnotation(comment = "持卖仓量变化")
    private String short_chg;
    @ExplainAnnotation(comment = "交易所")
    private String exchange;
}
