package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "大宗交易明细")
public class BondBlkDetailResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "债券代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "买方营业部")
    @KeyAnnotation
    private String buy_dp;
    @ExplainAnnotation(comment = "卖方营业部")
    @KeyAnnotation
    private String sell_dp;
    @ExplainAnnotation(comment = "债券名称")
    private String name;
    @ExplainAnnotation(comment = "成交价（元）")
    private String price;
    @ExplainAnnotation(comment = "成交数量（万股/万份/万张/万手）")
    private String vol;
    @ExplainAnnotation(comment = "成交金额（万元）")
    private String amount;
}
