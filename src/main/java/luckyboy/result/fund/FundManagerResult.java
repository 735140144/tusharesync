package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "基金经理")
public class FundManagerResult extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "基金经理姓名")
    private String name;
    @ExplainAnnotation(comment = "性别")
    private String gender;
    @ExplainAnnotation(comment = "出生年份")
    private String birth_year;
    @ExplainAnnotation(comment = "学历")
    private String edu;
    @ExplainAnnotation(comment = "国籍")
    private String nationality;
    @ExplainAnnotation(comment = "任职日期")
    private String begin_date;
    @ExplainAnnotation(comment = "离任日期")
    private String end_date;
    @ExplainAnnotation(comment = "简历")
    private String resume;
}
