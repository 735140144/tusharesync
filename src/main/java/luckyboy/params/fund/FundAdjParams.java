package luckyboy.params.fund;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FundAdjParams extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    private String trade_date;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "开始行数")
    private String offset;
    @ExplainAnnotation(comment = "最大行数")
    private String limit;
}
