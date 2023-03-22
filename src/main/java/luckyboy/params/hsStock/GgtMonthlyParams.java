package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class GgtMonthlyParams extends Formart {

    @ExplainAnnotation(comment = " 月度（格式YYYYMM，下同，支持多个输入）")
    private String month;

    @ExplainAnnotation(comment = " 开始月度")
    private String start_month;

    @ExplainAnnotation(comment = " 结束月度")
    private String end_month;
}
