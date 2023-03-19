package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "全国拍摄制作电视剧备案公示数据")
public class TeleplayRecordResult extends Formart {
    @ExplainAnnotation(comment = "电视剧名称")
    @KeyAnnotation
    @BucketAnnotation
    private String name;
    @ExplainAnnotation(comment = "题材")
    private String classify;
    @ExplainAnnotation(comment = "体裁")
    private String types;
    @ExplainAnnotation(comment = "报备机构")
    private String org;
    @ExplainAnnotation(comment = "报备时间")
    private String report_date;
    @ExplainAnnotation(comment = "许可证号")
    private String license_key;
    @ExplainAnnotation(comment = "集数")
    private String episodes;
    @ExplainAnnotation(comment = "拍摄时间")
    private String shooting_date;
    @ExplainAnnotation(comment = "制作周期")
    private String prod_cycle;
    @ExplainAnnotation(comment = "内容提要")
    private String content;
    @ExplainAnnotation(comment = "省级管理部门备案意见")
    private String pro_opi;
    @ExplainAnnotation(comment = "相关部门意见")
    private String dept_opi;
    @ExplainAnnotation(comment = "备注")
    private String remarks;

}
