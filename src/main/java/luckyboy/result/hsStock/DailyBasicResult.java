package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "每日指标")
public class DailyBasicResult extends Formart {

    @ExplainAnnotation(comment = " TS股票代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = " 交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;

    @ExplainAnnotation(comment = "当日收盘价")
    private String close;

    @ExplainAnnotation(comment = "换手率（%）")
    private String turnover_rate;

    @ExplainAnnotation(comment = "换手率（自由流通股）")
    private String turnover_rate_f;

    @ExplainAnnotation(comment = "量比")
    private String volume_ratio;

    @ExplainAnnotation(comment = "市盈率（总市值/净利润， 亏损的PE为空）")
    private String pe;

    @ExplainAnnotation(comment = "市盈率（TTM，亏损的PE为空）")
    private String pe_ttm;

    @ExplainAnnotation(comment = "市净率（总市值/净资产）")
    private String pb;

    @ExplainAnnotation(comment = "市销率")
    private String ps;

    @ExplainAnnotation(comment = "市销率（TTM）")
    private String ps_ttm;

    @ExplainAnnotation(comment = "股息率 （%）")
    private String dv_ratio;

    @ExplainAnnotation(comment = "股息率（TTM）（%）")
    private String dv_ttm;

    @ExplainAnnotation(comment = "总股本 （万股）")
    private String total_share;

    @ExplainAnnotation(comment = "流通股本 （万股）")
    private String float_share;

    @ExplainAnnotation(comment = "自由流通股本 （万）")
    private String free_share;

    @ExplainAnnotation(comment = "总市值 （万元）")
    private String total_mv;

    @ExplainAnnotation(comment = "流通市值（万元）")
    private String circ_mv;
}
