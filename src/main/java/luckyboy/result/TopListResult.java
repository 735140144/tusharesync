package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
public class TopListResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    private String trade_date;
    @ExplainAnnotation(comment = "代码")
    private String ts_code;
    @ExplainAnnotation(comment = "名称")
    private String name;
    @ExplainAnnotation(comment = "收盘价")
    private String close;
    @ExplainAnnotation(comment = "涨跌幅")
    private String pct_change;
    @ExplainAnnotation(comment = "换手率")
    private String turnover_rate;
    @ExplainAnnotation(comment = "总成交额")
    private String amount;
    @ExplainAnnotation(comment = "龙虎榜卖出额")
    private String l_sell;
    @ExplainAnnotation(comment = "龙虎榜买入额")
    private String l_buy;
    @ExplainAnnotation(comment = "龙虎榜成交额")
    private String l_amount;
    @ExplainAnnotation(comment = "龙虎榜净买入额")
    private String net_amount;
    @ExplainAnnotation(comment = "龙虎榜净买额占比")
    private String net_rate;
    @ExplainAnnotation(comment = "龙虎榜成交额占比")
    private String amount_rate;
    @ExplainAnnotation(comment = "当日流通市值")
    private String float_values;
    @ExplainAnnotation(comment = "上榜理由")
    private String reason;

}
