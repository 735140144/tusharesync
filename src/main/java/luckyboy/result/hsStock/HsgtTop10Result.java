package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class HsgtTop10Result extends Formart {
    /**
     *交易日期
     */
    private String trade_date;
    /**
     *股票代码
     */
    private String ts_code;
    /**
     *股票名称
     */
    private String name;
    /**
     *收盘价
     */
    private String close;
    /**
     *涨跌额
     */
    private String change;
    /**
     *资金排名
     */
    private String rank;
    /**
     *市场类型（1：沪市 3：深市）
     */
    private String market_type;
    /**
     *成交金额（元）
     */
    private String amount;
    /**
     *净成交金额（元）
     */
    private String net_amount;
    /**
     *买入金额（元）
     */
    private String buy;
    /**
     *卖出金额（元）
     */
    private String sell;
}
