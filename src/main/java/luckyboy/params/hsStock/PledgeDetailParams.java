package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class PledgeDetailParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
}
