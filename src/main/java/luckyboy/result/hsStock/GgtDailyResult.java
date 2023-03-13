package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class GgtDailyResult extends Formart {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     *买入成交金额（亿元）
     */
    private String buy_amount;
    /**
     *买入成交笔数（万笔）
     */
    private String buy_volume;
    /**
     *卖出成交金额（亿元）
     */
    private String sell_amount;
    /**
     *卖出成交笔数（万笔）
     */
    private String sell_volume;
}
