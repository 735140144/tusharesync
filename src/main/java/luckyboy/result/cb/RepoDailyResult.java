package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "债券回购日行情")
public class RepoDailyResult extends Formart {
    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "期限品种")
    private String repo_maturity;
    @ExplainAnnotation(comment = "前收盘(%)")
    private String pre_close;
    @ExplainAnnotation(comment = "开盘价(%)")
    private String open;
    @ExplainAnnotation(comment = "最高价(%)")
    private String high;
    @ExplainAnnotation(comment = "最低价(%)")
    private String low;
    @ExplainAnnotation(comment = "收盘价(%)")
    private String close;
    @ExplainAnnotation(comment = "加权价(%)")
    private String weight;
    @ExplainAnnotation(comment = "加权价(利率债)(%)")
    private String weight_r;
    @ExplainAnnotation(comment = "成交金额(万元)")
    private String amount;
    @ExplainAnnotation(comment = "成交笔数(笔)")
    private String num;
}
