package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class HsConstResult extends Formart {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 沪深港通类型SH沪SZ深
     */
    private String hs_type;
    /**
     * 纳入日期
     */
    private String in_date;
    /**
     * 剔除日期
     */
    private String out_date;
    /**
     * 是否最新 1是 0否
     */
    private String is_new;
}
