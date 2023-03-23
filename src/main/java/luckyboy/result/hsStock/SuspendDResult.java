package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "每日停复牌")
public class SuspendDResult extends Formart {

    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "停复牌日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;

    @ExplainAnnotation(comment = "日内停牌时间段")
    private String suspend_timing;

    @ExplainAnnotation(comment = "停复牌类型：S-停牌，R-复牌")
    private String suspend_type;
}
