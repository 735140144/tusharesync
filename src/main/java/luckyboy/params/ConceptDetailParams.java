package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class ConceptDetailParams extends Formart {
    @ExplainAnnotation(comment = "概念分类ID")
    private String id;
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
}
