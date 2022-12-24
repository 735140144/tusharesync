package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class WeeklyResult extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 周开盘价
     */
    private String open;
    /**
     * 周最高价
     */
    private String high;
    /**
     * 周最低价
     */
    private String low;
    /**
     * 周收盘价
     */
    private String close;
    /**
     * 上一周收价
     */
    private String pre_close;
    /**
     * 周涨跌额
     */
    private String change;
    /**
     * 周涨跌幅 （未复权)
     */
    private String pct_chg;
    /**
     * 周成交量 （手）
     */
    private String vol;
    /**
     * 周成交额 （千元）
     */
    private String amount;
}
