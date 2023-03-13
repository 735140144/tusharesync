package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class HkHoldParams extends Formart {
    @ExplainAnnotation(comment = "交易所代码")
    private String code;
    @ExplainAnnotation(comment = "TS股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    private String trade_date;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "类型：SH沪股通（北向）SZ深股通（北向）HK港股通（南向持股）")
    private String exchange;
}

