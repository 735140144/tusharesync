package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class StkHoldernumberParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "截止日期")
    private String enddate;
    @ExplainAnnotation(comment = "公告开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "公告结束日期")
    private String end_date;
}
