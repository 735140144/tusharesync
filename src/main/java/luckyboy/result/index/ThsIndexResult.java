package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class ThsIndexResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "名称")
    private String name;
    @ExplainAnnotation(comment = "成分个数")
    private String count;
    @ExplainAnnotation(comment = "交易所")
    private String exchange;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
    @ExplainAnnotation(comment = "N概念指数S特色指数")
    private String type;
}
