package luckyboy.result.fx;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "外汇基础信息（海外）")
public class FxObasicResult extends Formart {
    @ExplainAnnotation(comment = "外汇代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "名称")
    private String name;
    @ExplainAnnotation(comment = "分类")
    private String classify;
    @ExplainAnnotation(comment = "交易商")
    private String exchange;
    @ExplainAnnotation(comment = "最小交易单位")
    private String min_unit;
    @ExplainAnnotation(comment = "最大交易单位")
    private String max_unit;
    @ExplainAnnotation(comment = "点")
    private String pip;
    @ExplainAnnotation(comment = "点值")
    private String pip_cost;
    @ExplainAnnotation(comment = "目标差价")
    private String traget_spread;
    @ExplainAnnotation(comment = "最小止损距离（点子）")
    private String min_stop_distance;
    @ExplainAnnotation(comment = "交易时间")
    private String trading_hours;
    @ExplainAnnotation(comment = "休市时间")
    private String break_time;
}
