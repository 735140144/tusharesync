package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class DailyBasicResult extends Formart {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     *当日收盘价
     */
    private String close;
    /**
     *换手率（%）
     */
    private String turnover_rate;
    /**
     *换手率（自由流通股）
     */
    private String turnover_rate_f;
    /**
     *量比
     */
    private String volume_ratio;
    /**
     *市盈率（总市值/净利润， 亏损的PE为空）
     */
    private String pe;
    /**
     *市盈率（TTM，亏损的PE为空）
     */
    private String pe_ttm;
    /**
     *市净率（总市值/净资产）
     */
    private String pb;
    /**
     *市销率
     */
    private String ps;
    /**
     *市销率（TTM）
     */
    private String ps_ttm;
    /**
     *股息率 （%）
     */
    private String dv_ratio;
    /**
     *股息率（TTM）（%）
     */
    private String dv_ttm;
    /**
     *总股本 （万股）
     */
    private String total_share;
    /**
     *流通股本 （万股）
     */
    private String float_share;
    /**
     *自由流通股本 （万）
     */
    private String free_share;
    /**
     *总市值 （万元）
     */
    private String total_mv;
    /**
     *流通市值（万元）
     */
    private String circ_mv;
}
