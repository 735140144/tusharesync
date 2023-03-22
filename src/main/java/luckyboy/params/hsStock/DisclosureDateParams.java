package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class DisclosureDateParams extends Formart {

     @ExplainAnnotation(comment = "股票代码")
    private String ts_code;

     @ExplainAnnotation(comment = "财报周期（比如20181231表示2018年年报，20180630表示中报)")
    private String end_date;

     @ExplainAnnotation(comment = "计划披露日期")
    private String pre_date;

     @ExplainAnnotation(comment = "实际披露日期")
    private String actual_date;
}
