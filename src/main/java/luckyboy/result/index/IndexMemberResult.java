package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "申万行业成分构成")
public class IndexMemberResult extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    @KeyAnnotation
    @BucketAnnotation
    private String index_code;
    @ExplainAnnotation(comment = "成分股票代码")
    @KeyAnnotation
    private String con_code;
    @ExplainAnnotation(comment = "指数名称")
    private String index_name;
    @ExplainAnnotation(comment = "成分股票名称")
    private String con_name;
    @ExplainAnnotation(comment = "纳入日期")
    private String in_date;
    @ExplainAnnotation(comment = "剔除日期")
    private String out_date;
    @ExplainAnnotation(comment = "是否最新Y是N否")
    private String is_new;
}
