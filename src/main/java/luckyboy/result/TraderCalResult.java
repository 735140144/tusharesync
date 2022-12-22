package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;

@Data
public class TraderCalResult extends Formart {
    /**
     * 交易所 SSE上交所 SZSE深交所
     */
    private String exchange;
    /**
     * 日历日期
     */
    private String cal_date;
    /**
     * 	是否交易 0休市 1交易
     */
    private String is_open;
    /**
     * 上一个交易日
     */
    private String pretrade_date;
}
