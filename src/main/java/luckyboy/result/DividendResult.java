package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class DividendResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    private String ts_code;
    @ExplainAnnotation(comment = "分红年度")
    private String end_date;
    @ExplainAnnotation(comment = "预案公告日")
    private String ann_date;
    @ExplainAnnotation(comment = "实施进度")
    private String div_proc;
    @ExplainAnnotation(comment = "每股送转")
    private String stk_div;
    @ExplainAnnotation(comment = "每股送股比例")
    private String stk_bo_rate;
    @ExplainAnnotation(comment = "每股转增比例")
    private String stk_co_rate;
    @ExplainAnnotation(comment = "每股分红（税后）")
    private String cash_div;
    @ExplainAnnotation(comment = "每股分红（税前）")
    private String cash_div_tax;
    @ExplainAnnotation(comment = "股权登记日")
    private String record_date;
    @ExplainAnnotation(comment = "除权除息日")
    private String ex_date;
    @ExplainAnnotation(comment = "派息日")
    private String pay_date;
    @ExplainAnnotation(comment = "红股上市日")
    private String div_listdate;
    @ExplainAnnotation(comment = "实施公告日")
    private String imp_ann_date;
    @ExplainAnnotation(comment = "基准日")
    private String base_date;
    @ExplainAnnotation(comment = "基准股本（万）")
    private String base_share;
}
