package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class ConceptDetailResult extends Formart {
    @ExplainAnnotation(comment = "概念代码")
    private String id;
    @ExplainAnnotation(comment = "概念名称")
    private String concept_name;
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "纳入日期")
    private String in_date;
    @ExplainAnnotation(comment = "剔除日期")
    private String out_date;
}
