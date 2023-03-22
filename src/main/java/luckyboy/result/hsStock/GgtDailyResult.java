package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "港股通每日成交统计")
public class GgtDailyResult extends Formart {

    @ExplainAnnotation(comment = " 交易日期")
    private String trade_date;

    @ExplainAnnotation(comment = "买入成交金额（亿元）")
    private String buy_amount;

    @ExplainAnnotation(comment = "买入成交笔数（万笔）")
    private String buy_volume;

    @ExplainAnnotation(comment = "卖出成交金额（亿元）")
    private String sell_amount;

    @ExplainAnnotation(comment = "卖出成交笔数（万笔）")
    private String sell_volume;
}
