package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;

/**
 * 股票列表结果
 */
@Data
public class StockBasicResult extends Formart {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 股票代码
     */
    private String symbol;
    /**
     * 股票名称
     */
    private String name;
    /**
     * 地域
     */
    private String area;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 股票全称
     */
    private String fullname;
    /**
     * 英文全称
     */
    private String enname;
    /**
     * 拼音缩写
     */
    private String cnspell;
    /**
     * 市场类型（主板/创业板/科创板/CDR）
     */
    private String market;
    /**
     * 交易所代码
     */
    private String exchange;
    /**
     * 交易货币
     */
    private String curr_type;
    /**
     * 上市状态 L上市 D退市 P暂停上市
     */
    private String list_status;
    /**
     * 上市日期
     */
    private String list_date;
    /**
     * 退市日期
     */
    private String delist_date;
    /**
     * 是否沪深港通标的，N否 H沪股通 S深股通
     */
    private String is_hs;


}
