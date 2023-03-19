package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "债券大宗交易")
public class BondBlkResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "债券代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "债券名称")
    private String name;
    @ExplainAnnotation(comment = "成交价（元）")
    private String price;
    @ExplainAnnotation(comment = "累计成交数量（万股/万份/万张/万手）")
    private String vol;
    @ExplainAnnotation(comment = "累计成交金额（万元）")
    private String amount;
}
