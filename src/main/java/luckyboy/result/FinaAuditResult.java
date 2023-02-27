package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
public class FinaAuditResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "报告期")
    private String end_date;
    @ExplainAnnotation(comment = "审计结果")
    private String audit_result;
    @ExplainAnnotation(comment = "审计总费用（元）")
    private String audit_fees;
    @ExplainAnnotation(comment = "会计事务所")
    private String audit_agency;
    @ExplainAnnotation(comment = "签字会计师")
    private String audit_sign;
}