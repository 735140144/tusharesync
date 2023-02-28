package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class ShareFloatResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "解禁日期")
    private String float_date;
    @ExplainAnnotation(comment = "流通股份")
    private String float_share;
    @ExplainAnnotation(comment = "流通股份占总股本比率")
    private String float_ratio;
    @ExplainAnnotation(comment = "股东名称")
    private String holder_name;
    @ExplainAnnotation(comment = "股份类型")
    private String share_type;
}
