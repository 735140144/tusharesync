package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class NewShareResult extends Formart {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 申购代码
     */
    private String sub_code;
    /**
     * 名称
     */
    private String name;
    /**
     * 上网发行日期
     */
    private String ipo_date;
    /**
     * 上市日期
     */
    private String issue_date;
    /**
     * 发行总量（万股）
     */
    private String amount;
    /**
     * 上网发行总量（万股）
     */
    private String market_amount;
    /**
     * 发行价格
     */
    private String price;
    /**
     * 市盈率
     */
    private String pe;
    /**
     * 个人申购上限（万股）
     */
    private String limit_amount;
    /**
     * 募集资金（亿元）
     */
    private String funds;
    /**
     * 	中签率
     */
    private String ballot;
}
