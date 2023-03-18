package luckyboy.params.fut;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FutWeeklyDetailParams extends Formart {
    @ExplainAnnotation(comment = "周期")
    private String week;
    @ExplainAnnotation(comment = "期货品种")
    private String prd;
    @ExplainAnnotation(comment = "开始周期")
    private String start_week;
    @ExplainAnnotation(comment = "结束周期")
    private String end_week;
    @ExplainAnnotation(comment = "交易所")
    private String exchange;
    @ExplainAnnotation(comment = "提取的字段")
    private String fields;
}
