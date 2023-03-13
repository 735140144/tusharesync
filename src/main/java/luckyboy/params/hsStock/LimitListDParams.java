package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class LimitListDParams extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    private String trade_date;
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "涨跌停类型（U涨停D跌停Z炸板）")
    private String limit_type;
    @ExplainAnnotation(comment = "交易所（SH上交所SZ深交所BJ北交所）")
    private String exchange;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
}
