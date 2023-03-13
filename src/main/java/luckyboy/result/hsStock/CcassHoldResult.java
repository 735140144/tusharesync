package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class CcassHoldResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "股票代号")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "于中央结算系统的持股量(股)")
    private String shareholding;
    @ExplainAnnotation(comment = "参与者数目（个）")
    private String hold_nums;
    @ExplainAnnotation(comment = "占于上交所/深交所上市及交易的A股总数的百分比（%）")
    private String hold_ratio;
}
