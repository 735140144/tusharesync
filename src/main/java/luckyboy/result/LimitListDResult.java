package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class LimitListDResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "所属行业")
    private String industry;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "收盘价")
    private String close;
    @ExplainAnnotation(comment = "涨跌幅")
    private String pct_chg;
    @ExplainAnnotation(comment = "成交额")
    private String amount;
    @ExplainAnnotation(comment = "板上成交金额(涨停无此数据)")
    private String limit_amount;
    @ExplainAnnotation(comment = "流通市值")
    private String float_mv;
    @ExplainAnnotation(comment = "总市值")
    private String total_mv;
    @ExplainAnnotation(comment = "换手率")
    private String turnover_ratio;
    @ExplainAnnotation(comment = "封单金额")
    private String fd_amount;
    @ExplainAnnotation(comment = "首次封板时间（跌停无此数据）")
    private String first_time;
    @ExplainAnnotation(comment = "最后封板时间")
    private String last_time;
    @ExplainAnnotation(comment = "炸板次数(跌停为开板次数)")
    private String open_times;
    @ExplainAnnotation(comment = "涨停统计（N/T T天有N次涨停）")
    private String up_stat;
    @ExplainAnnotation(comment = "连板数")
    private String limit_times;
    @ExplainAnnotation(comment = "D跌停U涨停Z炸板")
    private String limit;
}
