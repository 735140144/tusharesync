package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class TopInstResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "营业部名称")
    private String exalter;
    @ExplainAnnotation(comment = "买卖类型0：买入金额最大的前5名， 1：卖出金额最大的前5名")
    private String side;
    @ExplainAnnotation(comment = "买入额（元）")
    private String buy;
    @ExplainAnnotation(comment = "买入占总成交比例")
    private String buy_rate;
    @ExplainAnnotation(comment = "卖出额（元）")
    private String sell;
    @ExplainAnnotation(comment = "卖出占总成交比例")
    private String sell_rate;
    @ExplainAnnotation(comment = "净成交额（元）")
    private String net_buy;
    @ExplainAnnotation(comment = "上榜理由")
    private String reason;
}
