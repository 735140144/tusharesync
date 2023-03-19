package luckyboy.params.cb;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class CbBasicParams extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    private String ts_code;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
    @ExplainAnnotation(comment = "上市地点")
    private String exchange;
}
