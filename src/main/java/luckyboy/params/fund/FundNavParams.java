package luckyboy.params.fund;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FundNavParams extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    private String ts_code;
    @ExplainAnnotation(comment = "净值日期")
    private String nav_date;
    @ExplainAnnotation(comment = "E场内 O场外")
    private String market;
    @ExplainAnnotation(comment = "净值开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "净值结束日期")
    private String end_date;
}
