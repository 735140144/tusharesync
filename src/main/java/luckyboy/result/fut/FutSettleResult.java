package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FutSettleResult extends Formart {
    @ExplainAnnotation(comment = "合约代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "结算价")
    private String settle;
    @ExplainAnnotation(comment = "交易手续费率")
    private String trading_fee_rate;
    @ExplainAnnotation(comment = "交易手续费")
    private String trading_fee;
    @ExplainAnnotation(comment = "交割手续费")
    private String delivery_fee;
    @ExplainAnnotation(comment = "买套保交易保证金率")
    private String b_hedging_margin_rate;
    @ExplainAnnotation(comment = "卖套保交易保证金率")
    private String s_hedging_margin_rate;
    @ExplainAnnotation(comment = "买投机交易保证金率")
    private String long_margin_rate;
    @ExplainAnnotation(comment = "卖投机交易保证金率")
    private String short_margin_rate;
    @ExplainAnnotation(comment = "平今仓手续率")
    private String offset_today_fee;
    @ExplainAnnotation(comment = "交易所")
    private String exchange;
}
