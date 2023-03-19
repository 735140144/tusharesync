package luckyboy.params.cb;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class EcoCalParams extends Formart {
    @ExplainAnnotation(comment = "日期")
    private String date;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "货币代码")
    private String currency;
    @ExplainAnnotation(comment = "国家")
    private String country;
    @ExplainAnnotation(comment = "事件")
    private String event;
}
