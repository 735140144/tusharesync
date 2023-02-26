package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
@Builder
public class Top10FloatholdersParams  extends Formart {
    @ExplainAnnotation(comment = "代码")
    private String ts_code;
    @ExplainAnnotation(comment = "报告期")
    private String period;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "报告期开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "报告期结束日期")
    private String end_date;
}
