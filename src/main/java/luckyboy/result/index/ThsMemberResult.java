package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class ThsMemberResult extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String code;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "权重(暂无)")
    private String weight;
    @ExplainAnnotation(comment = "纳入日期(暂无)")
    private String in_date;
    @ExplainAnnotation(comment = "剔除日期(暂无)")
    private String out_date;
    @ExplainAnnotation(comment = "是否最新Y是N否")
    private String is_new;
}
