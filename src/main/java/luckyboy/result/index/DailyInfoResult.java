package luckyboy.result.index;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "市场交易统计")
public class DailyInfoResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "市场代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "市场名称")
    private String ts_name;
    @ExplainAnnotation(comment = "挂牌数")
    private String com_count;
    @ExplainAnnotation(comment = "总股本（亿股）")
    private String total_share;
    @ExplainAnnotation(comment = "流通股本（亿股）")
    private String float_share;
    @ExplainAnnotation(comment = "总市值（亿元）")
    private String total_mv;
    @ExplainAnnotation(comment = "流通市值（亿元）")
    private String float_mv;
    @ExplainAnnotation(comment = "交易金额（亿元）")
    private String amount;
    @ExplainAnnotation(comment = "成交量（亿股）")
    private String vol;
    @ExplainAnnotation(comment = "成交笔数（万笔）")
    private String trans_count;
    @ExplainAnnotation(comment = "平均市盈率")
    private String pe;
    @ExplainAnnotation(comment = "换手率（％），注：深交所暂无此列")
    private String tr;
    @ExplainAnnotation(comment = "交易所（SH上交所 SZ深交所）")
    private String exchange;

}
