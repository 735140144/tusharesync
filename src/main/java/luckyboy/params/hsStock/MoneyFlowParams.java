package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class MoneyFlowParams extends Formart {

    @ExplainAnnotation(comment = " 股票代码 （股票和时间参数至少输入一个）")
    private String ts_code;

    @ExplainAnnotation(comment = " 交易日期")
    private String trade_date;

    @ExplainAnnotation(comment = " 开始日期")
    private String start_date;

    @ExplainAnnotation(comment = " 结束日期")
    private String end_date;
}
