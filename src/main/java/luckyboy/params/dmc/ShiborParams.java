package luckyboy.params.dmc;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class ShiborParams extends Formart {
    @ExplainAnnotation(comment = "日期")
    private String date;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
}
