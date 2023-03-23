package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;

@Data
@ResultComment(comment = "上市公司管理层信息")
public class StkManagersResult extends Formart {

    @ExplainAnnotation(comment = "TS股票代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;

    @ExplainAnnotation(comment = "姓名")
    private String name;

    @ExplainAnnotation(comment = "性别")
    private String gender;

    @ExplainAnnotation(comment = "岗位类别")
    private String lev;

    @ExplainAnnotation(comment = "岗位")
    private String title;

    @ExplainAnnotation(comment = "学历")
    private String edu;

    @ExplainAnnotation(comment = "国籍")
    private String national;

    @ExplainAnnotation(comment = "出生年月")
    private String birthday;

    @ExplainAnnotation(comment = "上任日期")
    private String begin_date;

    @ExplainAnnotation(comment = "离任日期")
    private String end_date;

    @ExplainAnnotation(comment = "个人简历")
    private String resume;
}
