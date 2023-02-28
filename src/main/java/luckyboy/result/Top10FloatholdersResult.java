package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class Top10FloatholdersResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "股东名称")
    @KeyAnnotation
    private String holder_name;
    @ExplainAnnotation(comment = "报告期")
    private String end_date;
    @ExplainAnnotation(comment = "持有数量（股）")
    private String hold_amount;
}
