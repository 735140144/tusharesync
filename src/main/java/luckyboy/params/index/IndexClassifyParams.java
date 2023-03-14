package luckyboy.params.index;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class IndexClassifyParams extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    private String index_code;
    @ExplainAnnotation(comment = "行业分级（L1/L2/L3）")
    private String level;
    @ExplainAnnotation(comment = "父级代码（一级为0）")
    private String parent_code;
    @ExplainAnnotation(comment = "指数来源（SW2014：申万2014年版本，SW2021：申万2021年版本）")
    private String src;
}
