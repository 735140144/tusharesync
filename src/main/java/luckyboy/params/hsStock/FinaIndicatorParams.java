package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FinaIndicatorParams extends Formart {

    @ExplainAnnotation(comment = " 股票代码")
    private String ts_code;

    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;

    @ExplainAnnotation(comment = "报告期开始日期")
    private String start_date;

    @ExplainAnnotation(comment = "报告期结束日期")
    private String end_date;

    @ExplainAnnotation(comment = "报告期(每个季度最后一天的日期,比如20171231表示年报)")
    private String period;

}
