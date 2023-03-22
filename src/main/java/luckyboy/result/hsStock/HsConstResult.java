package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "沪股通、深股通成分")
public class HsConstResult extends Formart {
    
    @ExplainAnnotation(comment=" TS代码")
    private String ts_code;
    
    @ExplainAnnotation(comment=" 沪深港通类型SH沪SZ深")
    private String hs_type;
    
    @ExplainAnnotation(comment=" 纳入日期")
    private String in_date;
    
    @ExplainAnnotation(comment=" 剔除日期")
    private String out_date;
    
    @ExplainAnnotation(comment=" 是否最新 1是 0否")
    private String is_new;
}
