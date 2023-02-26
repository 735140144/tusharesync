package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class FinaMainbzResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    private String ts_code;
    @ExplainAnnotation(comment = "报告期")
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
