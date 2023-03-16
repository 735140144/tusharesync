package luckyboy.params.fund;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FundBasicParams extends Formart {
    @ExplainAnnotation(comment = "交易市场: E场内 O场外（默认E）")
    private String market;
    @ExplainAnnotation(comment = "存续状态 D摘牌 I发行 L上市中")
    private String status;
}
