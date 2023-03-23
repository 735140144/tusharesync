package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "大盘指数每日指标")
public class IndexDailybasicResult extends Formart {
    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "当日总市值（元）")
    private String total_mv;
    @ExplainAnnotation(comment = "当日流通市值（元）")
    private String float_mv;
    @ExplainAnnotation(comment = "当日总股本（股）")
    private String total_share;
    @ExplainAnnotation(comment = "当日流通股本（股）")
    private String float_share;
    @ExplainAnnotation(comment = "当日自由流通股本（股）")
    private String free_share;
    @ExplainAnnotation(comment = "换手率")
    private String turnover_rate;
    @ExplainAnnotation(comment = "换手率(基于自由流通股本)")
    private String turnover_rate_f;
    @ExplainAnnotation(comment = "市盈率")
    private String pe;
    @ExplainAnnotation(comment = "市盈率TTM")
    private String pe_ttm;
    @ExplainAnnotation(comment = "市净率")
    private String pb;
}
