package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class MonthlyResult extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 月开盘价
     */
    private String open;
    /**
     * 月最高价
     */
    private String high;
    /**
     * 月最低价
     */
    private String low;
    /**
     * 月收盘价
     */
    private String close;
    /**
     * 上一月收价
     */
    private String pre_close;
    /**
     * 月涨跌额
     */
    private String change;
    /**
     * 月涨跌幅 （未复权)
     */
    private String pct_chg;
    /**
     * 月成交量 （手）
     */
    private String vol;
    /**
     * 月成交额 （千元）
     */
    private String amount;
}
