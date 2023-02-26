package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class StkHoldernumberResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "截止日期")
    private String end_date;
    @ExplainAnnotation(comment = "股东户数")
    private String holder_num;

}
