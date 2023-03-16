package luckyboy.params.fund;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FundPortfolioParams extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "报告期开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "报告期结束日期")
    private String end_date;
}
