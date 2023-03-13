package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class CyqPerfResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "历史最低价")
    private String his_low;
    @ExplainAnnotation(comment = "历史最高价")
    private String his_high;
    @ExplainAnnotation(comment = "5分位成本")
    private String cost_5pct;
    @ExplainAnnotation(comment = "15分位成本")
    private String cost_15pct;
    @ExplainAnnotation(comment = "50分位成本")
    private String cost_50pct;
    @ExplainAnnotation(comment = "85分位成本")
    private String cost_85pct;
    @ExplainAnnotation(comment = "95分位成本")
    private String cost_95pct;
    @ExplainAnnotation(comment = "加权平均成本")
    private String weight_avg;
    @ExplainAnnotation(comment = "胜率")
    private String winner_rate;

}
