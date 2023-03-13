package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class StkLimitResult extends Formart {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     *TS股票代码
     */
    private String ts_code;
    /**
     *昨日收盘价
     */
    private String pre_close;
    /**
     *涨停价
     */
    private String up_limit;
    /**
     *跌停价
     */
    private String down_limit;
}
