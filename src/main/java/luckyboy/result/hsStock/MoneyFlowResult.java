package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "个股资金流向")
public class MoneyFlowResult extends Formart {

    @ExplainAnnotation(comment = " TS代码")
    @KeyAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;

    @ExplainAnnotation(comment = "小单买入量（手）")
    private String buy_sm_vol;

    @ExplainAnnotation(comment = "小单买入金额（万元）")
    private String buy_sm_amount;

    @ExplainAnnotation(comment = "小单卖出量（手）")
    private String sell_sm_vol;

    @ExplainAnnotation(comment = "小单卖出金额（万元）")
    private String sell_sm_amount;

    @ExplainAnnotation(comment = "中单买入量（手）")
    private String buy_md_vol;

    @ExplainAnnotation(comment = "中单买入金额（万元）")
    private String buy_md_amount;

    @ExplainAnnotation(comment = "中单卖出量（手）")
    private String sell_md_vol;

    @ExplainAnnotation(comment = "中单卖出金额（万元）")
    private String sell_md_amount;

    @ExplainAnnotation(comment = "大单买入量（手）")
    private String buy_lg_vol;

    @ExplainAnnotation(comment = "大单买入金额（万元）")
    private String buy_lg_amount;

    @ExplainAnnotation(comment = "大单卖出量（手）")
    private String sell_lg_vol;

    @ExplainAnnotation(comment = "大单卖出金额（万元）")
    private String sell_lg_amount;

    @ExplainAnnotation(comment = "特大单买入量（手）")
    private String buy_elg_vol;

    @ExplainAnnotation(comment = "特大单买入金额（万元）")
    private String buy_elg_amount;

    @ExplainAnnotation(comment = "特大单卖出量（手）")
    private String sell_elg_vol;

    @ExplainAnnotation(comment = "特大单卖出金额（万元）")
    private String sell_elg_amount;

    @ExplainAnnotation(comment = "净流入量（手）")
    private String net_mf_vol;

    @ExplainAnnotation(comment = "净流入额（万元）")
    private String net_mf_amount;

}
