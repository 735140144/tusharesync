package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
@Builder
public class DividendParams extends Formart {

     @ExplainAnnotation(comment = " 代码")
    private String ts_code;

     @ExplainAnnotation(comment = "公告日")
    private String ann_date;

     @ExplainAnnotation(comment = "股权登记日期")
    private String record_date;

     @ExplainAnnotation(comment = "除权除息日")
    private String ex_date;

     @ExplainAnnotation(comment = "	实施公告日")
    private String imp_ann_date;
}
