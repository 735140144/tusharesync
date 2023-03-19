package luckyboy.result.us;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "美股列表")
public class UsBasicResult extends Formart {
    @ExplainAnnotation(comment = "美股代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "中文名称")
    private String name;
    @ExplainAnnotation(comment = "英文名称")
    private String enname;
    @ExplainAnnotation(comment = "分类ADR/GDR/EQ")
    private String classify;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
    @ExplainAnnotation(comment = "退市日期")
    private String delist_date;
}
