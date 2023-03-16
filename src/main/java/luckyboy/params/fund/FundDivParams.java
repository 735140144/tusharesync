package luckyboy.params.fund;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FundDivParams extends Formart {
    @ExplainAnnotation(comment = "公告日")
    private String ann_date;
    @ExplainAnnotation(comment = "除息日")
    private String ex_date;
    @ExplainAnnotation(comment = "派息日")
    private String pay_date;
    @ExplainAnnotation(comment = "基金代码")
    private String ts_code;
}
