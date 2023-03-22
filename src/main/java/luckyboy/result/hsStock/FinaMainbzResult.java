package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "主营业务构成")
public class FinaMainbzResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "报告期")
    @KeyAnnotation
    @BucketAnnotation
    private String end_date;
    @ExplainAnnotation(comment = "主营业务来源")
    private String bz_item;
    @ExplainAnnotation(comment = "主营业务收入(元)")
    private String bz_sales;
    @ExplainAnnotation(comment = "主营业务利润(元)")
    private String bz_profit;
    @ExplainAnnotation(comment = "主营业务成本(元)")
    private String bz_cost;
    @ExplainAnnotation(comment = "货币代码")
    private String curr_type;
    @ExplainAnnotation(comment = "是否更新")
    private String update_flag;
}
