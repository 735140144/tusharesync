package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class StkFactorParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期 （yyyymmdd，下同）")
    private String trade_date;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
}
