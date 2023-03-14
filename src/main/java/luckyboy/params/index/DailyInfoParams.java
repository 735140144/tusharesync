package luckyboy.params.index;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class DailyInfoParams extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    private String trade_date;
    @ExplainAnnotation(comment = "板块代码")
    private String ts_code;
    @ExplainAnnotation(comment = "股票市场（SH上交所 SZ深交所）")
    private String exchange;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "指定提取字段")
    private String fields;
}
