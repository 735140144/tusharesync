package luckyboy.params.cb;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class CbIssueParams extends Formart {
    @ExplainAnnotation(comment = "TS代码")
    private String ts_code;
    @ExplainAnnotation(comment = "发行公告日")
    private String ann_date;
    @ExplainAnnotation(comment = "公告开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "公告结束日期")
    private String end_date;
}
