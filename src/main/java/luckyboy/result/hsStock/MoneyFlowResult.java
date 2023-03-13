package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class MoneyFlowResult extends Formart {
    /**
     *TS代码
     */
    private String ts_code;
    /**
     *交易日期
     */
    private String trade_date;
    /**
     *小单买入量（手）
     */
    private String buy_sm_vol;
    /**
     *小单买入金额（万元）
     */
    private String buy_sm_amount;
    /**
     *小单卖出量（手）
     */
    private String sell_sm_vol;
    /**
     *小单卖出金额（万元）
     */
    private String sell_sm_amount;
    /**
     *中单买入量（手）
     */
    private String buy_md_vol;
    /**
     *中单买入金额（万元）
     */
    private String buy_md_amount;
    /**
     *中单卖出量（手）
     */
    private String sell_md_vol;
    /**
     *中单卖出金额（万元）
     */
    private String sell_md_amount;
    /**
     *大单买入量（手）
     */
    private String buy_lg_vol;
    /**
     *大单买入金额（万元）
     */
    private String buy_lg_amount;
    /**
     *大单卖出量（手）
     */
    private String sell_lg_vol;
    /**
     *大单卖出金额（万元）
     */
    private String sell_lg_amount;
    /**
     *特大单买入量（手）
     */
    private String buy_elg_vol;
    /**
     *特大单买入金额（万元）
     */
    private String buy_elg_amount;
    /**
     *特大单卖出量（手）
     */
    private String sell_elg_vol;
    /**
     *特大单卖出金额（万元）
     */
    private String sell_elg_amount;
    /**
     *净流入量（手）
     */
    private String net_mf_vol;
    /**
     *净流入额（万元）
     */
    private String net_mf_amount;
    /**
     * 小单：5万以下 中单：5万～20万 大单：20万～100万 特大单：成交额>=100万
     */
}
