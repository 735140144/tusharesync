package luckyboy.params.fx;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FxObasicParams extends Formart {
    @ExplainAnnotation(comment = "交易商")
    private String exchange;
    @ExplainAnnotation(comment = "分类")
    private String classify;
    @ExplainAnnotation(comment = "TS代码")
    private String ts_code;
}
