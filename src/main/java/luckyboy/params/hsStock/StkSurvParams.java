package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class StkSurvParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "调研日期")
    private String trade_date;
    @ExplainAnnotation(comment = "调研开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "调研结束日期")
    private String end_date;
}
