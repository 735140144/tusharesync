package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class ConceptResult extends Formart {
    @ExplainAnnotation(comment = "概念分类")
    private String code;
    @ExplainAnnotation(comment = "概念分类名称")
    private String name;
    @ExplainAnnotation(comment = "来源")
    private String src;
}
