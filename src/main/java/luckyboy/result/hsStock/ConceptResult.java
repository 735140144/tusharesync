package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "概念股分类")
public class ConceptResult extends Formart {
    @ExplainAnnotation(comment = "概念分类")
    @KeyAnnotation
    @BucketAnnotation
    private String code;
    @ExplainAnnotation(comment = "概念分类名称")
    private String name;
    @ExplainAnnotation(comment = "来源")
    private String src;
}
