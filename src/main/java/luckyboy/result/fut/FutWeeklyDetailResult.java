package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;

@Data
@ResultComment(comment = "期货主要品种交易周报")
public class FutWeeklyDetailResult extends Formart {
    @ExplainAnnotation(comment = "交易所代码")
    @KeyAnnotation
    @BucketAnnotation
    private String exchange;
    @ExplainAnnotation(comment = "期货品种代码")
    @KeyAnnotation
    private String prd;
    @ExplainAnnotation(comment = "周期")
    @KeyAnnotation
    private String week;
    @ExplainAnnotation(comment = "品种名称")
    private String name;
    @ExplainAnnotation(comment = "成交量（手）")
    private String vol;
    @ExplainAnnotation(comment = "同比增减（%）")
    private String vol_yoy;
    @ExplainAnnotation(comment = "成交金额（亿元）")
    private String amount;
    @ExplainAnnotation(comment = "同比增减（%）")
    private String amout_yoy;
    @ExplainAnnotation(comment = "年累计成交总量（手）")
    private String cumvol;
    @ExplainAnnotation(comment = "同比增减（%）")
    private String cumvol_yoy;
    @ExplainAnnotation(comment = "年累计成交金额（亿元）")
    private String cumamt;
    @ExplainAnnotation(comment = "同比增减（%）")
    private String cumamt_yoy;
    @ExplainAnnotation(comment = "持仓量（手）")
    private String open_interest;
    @ExplainAnnotation(comment = "环比增减（%）")
    private String interest_wow;
    @ExplainAnnotation(comment = "本周主力合约收盘价")
    private String mc_close;
    @ExplainAnnotation(comment = "环比涨跌（%）")
    private String close_wow;
    @ExplainAnnotation(comment = "周日期")
    private String week_date;
}
