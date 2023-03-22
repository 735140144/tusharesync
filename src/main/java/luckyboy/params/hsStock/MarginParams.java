package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class MarginParams extends Formart {

    @ExplainAnnotation(comment = " 交易日期")
    private String trade_date;

    @ExplainAnnotation(comment = "交易所代码")
    private String exchange_id;

    @ExplainAnnotation(comment = "开始日期")
    private String start_date;

    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
}
