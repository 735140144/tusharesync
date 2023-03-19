package luckyboy.params.cb;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class CbShareParams extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    private String ts_code;
}
