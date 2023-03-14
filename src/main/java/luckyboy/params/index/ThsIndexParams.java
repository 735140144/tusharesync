package luckyboy.params.index;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class ThsIndexParams extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    private String ts_code;
    @ExplainAnnotation(comment = "市场类型A-a股 HK-港股 US-美股")
    private String exchange;
    @ExplainAnnotation(comment = "指数类型 N-板块指数 I-行业指数 R-地域指数 S-同花顺特色指数")
    private String type;
}
