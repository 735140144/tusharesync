package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class GgtMonthlyResult extends Formart {
    /**
     * 交易日期
     */
    private String month;
    /**
     *当月日均买入成交金额（亿元）
     */
    private String day_buy_amt;
    /**
     *当月日均买入成交笔数（万笔）
     */
    private String day_buy_vol;
    /**
     *当月日均卖出成交金额（亿元）
     */
    private String day_sell_amt;
    /**
     *当月日均卖出成交笔数（万笔）
     */
    private String day_sell_vol;
    /**
     *总买入成交金额（亿元）
     */
    private String total_buy_amt;
    /**
     *总买入成交笔数（万笔）
     */
    private String total_buy_vol;
    /**
     *总卖出成交金额（亿元）
     */
    private String total_sell_amt;
    /**
     *总卖出成交笔数（万笔）
     */
    private String total_sell_vol;
}
