package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class HsConstParams extends Formart {

    @ExplainAnnotation(comment = " 类型SH沪股通SZ深股通")
    private String hs_type;

    @ExplainAnnotation(comment = " 是否最新 1 是 0 否 (默认1)")
    private String is_new;
}
