package luckyboy.params.index;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class ThsMemberParams extends Formart {
    @ExplainAnnotation(comment = "板块指数代码")
    private String ts_code;
    @ExplainAnnotation(comment = "股票代码")
    private String code;
}
