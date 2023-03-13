package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class BrokerRecommendParams extends Formart {
    @ExplainAnnotation(comment = "月度（YYYYMM）")
    private String month;
}
