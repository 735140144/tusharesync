package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "管理层薪酬和持股信息")
public class StkRewardsResult extends Formart {

    @ExplainAnnotation(comment = "TS股票代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;

    @ExplainAnnotation(comment = "截止日期")
    private String end_date;

    @ExplainAnnotation(comment = "姓名")
    private String name;

    @ExplainAnnotation(comment = "职务")
    private String title;

    @ExplainAnnotation(comment = "报酬")
    private String reward;

    @ExplainAnnotation(comment = "持股数")
    private String hold_vol;
}
