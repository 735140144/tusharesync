package luckyboy.params.index;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class IndexMemberParams extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    private String index_code;
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "是否最新（默认为“Y是”）")
    private String is_new;
}
