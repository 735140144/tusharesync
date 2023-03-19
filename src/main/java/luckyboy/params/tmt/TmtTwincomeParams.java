package luckyboy.params.tmt;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class TmtTwincomeParams extends Formart {
    @ExplainAnnotation(comment = "报告期")
    private String date;
    @ExplainAnnotation(comment = "产品代码")
    private String item;
    @ExplainAnnotation(comment = "报告期开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "报告期结束日期")
    private String end_date;
}
