package luckyboy.result.stock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "动能因子")
public class StockMxResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "动能评级")
    private String mx_grade;
    @ExplainAnnotation(comment = "行业轮动指标")
    private String com_stock;
    @ExplainAnnotation(comment = "速度指标，衡量该个股股价变化的速度")
    private String evd_v;
    @ExplainAnnotation(comment = "极值，短期均线离差值")
    private String zt_sum_z;
    @ExplainAnnotation(comment = "偏离指标，中期均线偏离度指标")
    private String wma250_z;
}
