package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;

@Data
public class FinaAuditResult extends Formart {
    private String ts_code;
    private String ann_date;
    private String end_date;
    private String audit_result;
    private String audit_fees;
    private String audit_agency;
    private String audit_sign;
}
