package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class MarginTargetParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "是否最新")
    private String is_new;
    @ExplainAnnotation(comment = "标的类型：B买入标的 S卖出标的")
    private String mg_type;
}

