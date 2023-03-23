package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "申万行业分类")
public class IndexClassifyResult extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    @KeyAnnotation
    @BucketAnnotation
    private String index_code;
    @ExplainAnnotation(comment = "行业名称")
    private String industry_name;
    @ExplainAnnotation(comment = "父级代码")
    private String parent_code;
    @ExplainAnnotation(comment = "行业名称")
    private String level;
    @ExplainAnnotation(comment = "行业代码")
    private String industry_code;
    @ExplainAnnotation(comment = "是否发布了指数")
    private String is_pub;
    @ExplainAnnotation(comment = "行业分类（SW申万）")
    private String src;
}
