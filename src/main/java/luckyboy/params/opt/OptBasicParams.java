package luckyboy.params.opt;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class OptBasicParams extends Formart {
    @ExplainAnnotation(comment = "期权代码")
    private String ts_code;
    @ExplainAnnotation(comment = "交易所代码")
    private String exchange;
    @ExplainAnnotation(comment = "期权类型")
    private String call_put;
}
