package luckyboy.result.index;

import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;

public class IndexBasicResult extends Formart {
    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "简称")
    private String name;
    @ExplainAnnotation(comment = "指数全称")
    private String fullname ;
    @ExplainAnnotation(comment = "市场")
    private String market;
    @ExplainAnnotation(comment = "发布方")
    private String publisher;
    @ExplainAnnotation(comment = "指数风格")
    private String index_type;
    @ExplainAnnotation(comment = "指数类别")
    private String category;
    @ExplainAnnotation(comment = "基期")
    private String base_date;
    @ExplainAnnotation(comment = "基点")
    private String base_point;
    @ExplainAnnotation(comment = "发布日期")
    private String list_date;
    @ExplainAnnotation(comment = "加权方式")
    private String weight_rule;
    @ExplainAnnotation(comment = "描述")
    private String desc;
    @ExplainAnnotation(comment = "终止日期")
    private String exp_date;
}
