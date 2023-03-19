package luckyboy.params.us;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class UsBasicParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "股票分类")
    private String classify;
    @ExplainAnnotation(comment = "开始行数")
    private String offset;
    @ExplainAnnotation(comment = "每页最大行数")
    private String limit;
}
