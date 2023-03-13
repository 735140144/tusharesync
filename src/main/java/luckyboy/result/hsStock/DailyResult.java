package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class DailyResult extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 开盘价
     */
    private String open;
    /**
     * 最高价
     */
    private String high;
    /**
     * 最低价
     */
    private String low;
    /**
     * 收盘价
     */
    private String close;
    /**
     * 昨收价(前复权)
     */
    private String pre_close;
    /**
     * 涨跌额
     */
    private String change;
    /**
     * 涨跌幅 （未复权)
     */
    private String pct_chg;
    /**
     * 成交量 （手）
     */
    private String vol;
    /**
     * 成交额 （千元）
     */
    private String amount;
}
