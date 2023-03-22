package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class SuspendDParams extends Formart {

    @ExplainAnnotation(comment = " 股票代码(可输入多值)")
    private String ts_code;

    @ExplainAnnotation(comment = "交易日日期")
    private String trade_date;

    @ExplainAnnotation(comment = "停复牌查询开始日期")
    private String start_date;

    @ExplainAnnotation(comment = "停复牌查询结束日期")
    private String end_date;

    @ExplainAnnotation(comment = "停复牌类型：S-停牌,R-复牌")
    private String suspend_type;
}
