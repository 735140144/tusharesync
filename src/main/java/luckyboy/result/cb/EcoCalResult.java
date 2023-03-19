package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "财经日历")
public class EcoCalResult extends Formart {
    @ExplainAnnotation(comment = "日期")
    @KeyAnnotation
    @BucketAnnotation
    private String date;
    @ExplainAnnotation(comment = "时间")
    @KeyAnnotation
    private String time;
    @ExplainAnnotation(comment = "经济事件")
    @KeyAnnotation
    private String event;
    @ExplainAnnotation(comment = "货币代码")
    private String currency;
    @ExplainAnnotation(comment = "国家")
    private String country;
    @ExplainAnnotation(comment = "今值")
    private String value;
    @ExplainAnnotation(comment = "前值")
    private String pre_value;
    @ExplainAnnotation(comment = "预测值")
    private String fore_value;
}
