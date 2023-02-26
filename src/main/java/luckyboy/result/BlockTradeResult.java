package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class BlockTradeResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    private String ts_code;
    @ExplainAnnotation(comment = "交易日历")
    private String trade_date;
    @ExplainAnnotation(comment = "成交价")
    private String price;
    @ExplainAnnotation(comment = "成交量（万股）")
    private String vol;
    @ExplainAnnotation(comment = "成交金额")
    private String amount;
    @ExplainAnnotation(comment = "买方营业部")
    private String buyer;
    @ExplainAnnotation(comment = "卖方营业部")
    private String seller;

}
