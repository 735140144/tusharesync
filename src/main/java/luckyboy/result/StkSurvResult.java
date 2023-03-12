package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class StkSurvResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "调研日期")
    @KeyAnnotation
    private String surv_date;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "机构参与人员")
    private String fund_visitors;
    @ExplainAnnotation(comment = "接待地点")
    private String rece_place;
    @ExplainAnnotation(comment = "接待方式")
    private String rece_mode;
    @ExplainAnnotation(comment = "接待的公司")
    private String rece_org;
    @ExplainAnnotation(comment = "接待公司类型")
    private String org_type;
    @ExplainAnnotation(comment = "上市公司接待人员")
    private String comp_rece;
    @ExplainAnnotation(comment = "调研内容")
    private String content;
}
