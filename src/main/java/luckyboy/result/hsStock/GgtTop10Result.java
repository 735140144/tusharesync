package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;

@Data
@ResultComment(comment = "港股通十大成交股")
public class GgtTop10Result extends Formart {
   
    @ExplainAnnotation(comment="交易日期")
    private String trade_date;
   
    @ExplainAnnotation(comment="股票代码")
    private String ts_code;
   
    @ExplainAnnotation(comment="股票名称")
    private String name;
   
    @ExplainAnnotation(comment="收盘价")
    private String close;
   
    @ExplainAnnotation(comment="涨跌幅")
    private String p_change;
   
    @ExplainAnnotation(comment="资金排名")
    private String rank;
   
    @ExplainAnnotation(comment="市场类型 2：港股通（沪） 4：港股通（深）")
    private String market_type;
   
    @ExplainAnnotation(comment="累计成交金额（元）")
    private String amount;
   
    @ExplainAnnotation(comment="净买入金额（元）")
    private String net_amount;
   
    @ExplainAnnotation(comment="沪市成交金额（元）")
    private String sh_amount;
   
    @ExplainAnnotation(comment="沪市净买入金额（元）")
    private String sh_net_amount;
   
    @ExplainAnnotation(comment="沪市买入金额（元）")
    private String sh_buy;
   
    @ExplainAnnotation(comment="沪市卖出金额")
    private String sh_sell;
   
    @ExplainAnnotation(comment="深市成交金额（元）")
    private String sz_amount;
   
    @ExplainAnnotation(comment="深市净买入金额（元）")
    private String sz_net_amount;
   
    @ExplainAnnotation(comment="深市买入金额（元）")
    private String sz_buy;
   
    @ExplainAnnotation(comment="深市卖出金额（元）")
    private String sz_sell;


}
