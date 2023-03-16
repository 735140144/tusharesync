package luckyboy.params.fund;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FundManagerParams extends Formart {
    @ExplainAnnotation(comment = "基金代码，支持多只基金，逗号分隔")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "基金经理姓名")
    private String name;
    @ExplainAnnotation(comment = "开始行数")
    private String offset;
    @ExplainAnnotation(comment = "每页行数")
    private String limit;
}
