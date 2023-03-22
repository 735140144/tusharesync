package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class HsgtTop10Params extends Formart {

    @ExplainAnnotation(comment = " 股票代码（二选一）")
    private String ts_code;

    @ExplainAnnotation(comment = " 交易日期（二选一）")
    private String trade_date;

    @ExplainAnnotation(comment = " 开始日期")
    private String start_date;

    @ExplainAnnotation(comment = " 结束日期")
    private String end_date;

    @ExplainAnnotation(comment = "市场类型（1：沪市 3：深市）")
    private String market_type;
}
