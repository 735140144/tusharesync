package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "沪深股通持股明细")
public class HkHoldResult extends Formart {
    @ExplainAnnotation(comment = "原始代码")
    @KeyAnnotation
    @BucketAnnotation
    private String code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "持股数量(股)")
    private String vol;
    @ExplainAnnotation(comment = "持股占比（%），占已发行股份百分比")
    private String ratio;
    @ExplainAnnotation(comment = "类型：SH沪股通SZ深股通HK港股通")
    private String exchange;
}
