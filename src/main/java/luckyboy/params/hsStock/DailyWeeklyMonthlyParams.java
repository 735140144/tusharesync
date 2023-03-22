package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
@Builder
public class DailyWeeklyMonthlyParams extends Formart {
    @ExplainAnnotation(comment = " 股票代码（支持多个股票同时提取，逗号分隔）")
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期（YYYYMMDD）")
    private String trade_date;
    @ExplainAnnotation(comment = "开始日期(YYYYMMDD)")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期(YYYYMMDD)")
    private String end_date;
}
