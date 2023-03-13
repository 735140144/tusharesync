package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class ReportRcParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;

    @ExplainAnnotation(comment = "报告日期")
    private String report_date;

    @ExplainAnnotation(comment = "报告开始日期")
    private String start_date;

    @ExplainAnnotation(comment = "报告结束日期")
    private String end_date;
}
