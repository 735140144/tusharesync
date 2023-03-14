package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class SzDailyInfoResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "市场类型")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票个数")
    private String count;
    @ExplainAnnotation(comment = "成交金额")
    private String amount;
    @ExplainAnnotation(comment = "成交量")
    private String vol;
    @ExplainAnnotation(comment = "总股本")
    private String total_share;
    @ExplainAnnotation(comment = "总市值")
    private String total_mv;
    @ExplainAnnotation(comment = "流通股票")
    private String float_share;
    @ExplainAnnotation(comment = "流通市值")
    private String float_mv;
}
