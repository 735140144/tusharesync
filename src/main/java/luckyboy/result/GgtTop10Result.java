package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;

@Data
public class GgtTop10Result extends Formart {
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
     *涨跌幅
     */
    private String p_change;
    /**
     *资金排名
     */
    private String rank;
    /**
     *市场类型 2：港股通（沪） 4：港股通（深）
     */
    private String market_type;
    /**
     *累计成交金额（元）
     */
    private String amount;
    /**
     *净买入金额（元）
     */
    private String net_amount;
    /**
     *沪市成交金额（元）
     */
    private String sh_amount;
    /**
     *沪市净买入金额（元）
     */
    private String sh_net_amount;
    /**
     *沪市买入金额（元）
     */
    private String sh_buy;
    /**
     *沪市卖出金额
     */
    private String sh_sell;
    /**
     *深市成交金额（元）
     */
    private String sz_amount;
    /**
     *深市净买入金额（元）
     */
    private String sz_net_amount;
    /**
     *深市买入金额（元）
     */
    private String sz_buy;
    /**
     *深市卖出金额（元）
     */
    private String sz_sell;


}
