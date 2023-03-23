package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "港股通每月成交统计")
public class GgtMonthlyResult extends Formart {

    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String month;

    @ExplainAnnotation(comment = "当月日均买入成交金额（亿元）")
    private String day_buy_amt;

    @ExplainAnnotation(comment = "当月日均买入成交笔数（万笔）")
    private String day_buy_vol;

    @ExplainAnnotation(comment = "当月日均卖出成交金额（亿元）")
    private String day_sell_amt;

    @ExplainAnnotation(comment = "当月日均卖出成交笔数（万笔）")
    private String day_sell_vol;

    @ExplainAnnotation(comment = "总买入成交金额（亿元）")
    private String total_buy_amt;

    @ExplainAnnotation(comment = "总买入成交笔数（万笔）")
    private String total_buy_vol;

    @ExplainAnnotation(comment = "总卖出成交金额（亿元）")
    private String total_sell_amt;

    @ExplainAnnotation(comment = "总卖出成交笔数（万笔）")
    private String total_sell_vol;
}
