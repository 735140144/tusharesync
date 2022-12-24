package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class SuspendDParams extends Formart {
    /**
     *股票代码(可输入多值)
     */
    private String ts_code;
    /**
     *交易日日期
     */
    private String trade_date;
    /**
     *停复牌查询开始日期
     */
    private String start_date;
    /**
     *停复牌查询结束日期
     */
    private String end_date;
    /**
     *停复牌类型：S-停牌,R-复牌
     */
    private String suspend_type;
}
