package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class Top10HoldersResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "报告期")
    private String end_date;
    @ExplainAnnotation(comment = "股东名称")
    private String holder_name;
    @ExplainAnnotation(comment = "持有数量（股）")
    private String hold_amount;
    @ExplainAnnotation(comment = "持有比例")
    private String hold_ratio;
}
