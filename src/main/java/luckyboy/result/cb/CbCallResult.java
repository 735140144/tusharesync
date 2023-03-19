package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "可转债赎回信息")
public class CbCallResult extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告/提示日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "赎回类型：到赎、强赎")
    private String call_type;
    @ExplainAnnotation(comment = "是否赎回：已满足强赎条件、公告提示强赎、公告实施强赎、公告到期赎回、公告不强赎")
    private String is_call;
    @ExplainAnnotation(comment = "赎回日期")
    private String call_date;
    @ExplainAnnotation(comment = "赎回价格(含税，元/张)")
    private String call_price;
    @ExplainAnnotation(comment = "赎回价格(扣税，元/张)")
    private String call_price_tax;
    @ExplainAnnotation(comment = "赎回债券数量(张)")
    private String call_vol;
    @ExplainAnnotation(comment = "赎回金额(万元)")
    private String call_amount;
    @ExplainAnnotation(comment = "行权后款项到账日")
    private String payment_date;
    @ExplainAnnotation(comment = "赎回登记日")
    private String call_reg_date;
}
