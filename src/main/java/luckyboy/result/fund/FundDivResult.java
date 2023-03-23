package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "公募基金分红")
public class FundDivResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "分红实施公告日")
    private String imp_anndate;
    @ExplainAnnotation(comment = "分配收益基准日")
    private String base_date;
    @ExplainAnnotation(comment = "方案进度")
    private String div_proc;
    @ExplainAnnotation(comment = "权益登记日")
    private String record_date;
    @ExplainAnnotation(comment = "除息日")
    private String ex_date;
    @ExplainAnnotation(comment = "派息日")
    private String pay_date;
    @ExplainAnnotation(comment = "收益支付日")
    private String earpay_date;
    @ExplainAnnotation(comment = "净值除权日")
    private String net_ex_date;
    @ExplainAnnotation(comment = "每股派息(元)")
    private String div_cash;
    @ExplainAnnotation(comment = "基准基金份额(万份)")
    private String base_unit;
    @ExplainAnnotation(comment = "可分配收益(元)")
    private String ear_distr;
    @ExplainAnnotation(comment = "收益分配金额(元)")
    private String ear_amount;
    @ExplainAnnotation(comment = "红利再投资到账日")
    private String account_date;
    @ExplainAnnotation(comment = "份额基准年度")
    private String base_year;
}
