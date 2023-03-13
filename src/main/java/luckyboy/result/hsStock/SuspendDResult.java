package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class SuspendDResult extends Formart {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 停复牌日期
     */
    private String trade_date;
    /**
     * 日内停牌时间段
     */
    private String suspend_timing;
    /**
     * 停复牌类型：S-停牌，R-复牌
     */
    private String suspend_type;
}
