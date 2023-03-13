package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class ShareFloatParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "解禁日期")
    private String float_date;
    @ExplainAnnotation(comment = "解禁开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "解禁结束日期")
    private String end_date;
}
