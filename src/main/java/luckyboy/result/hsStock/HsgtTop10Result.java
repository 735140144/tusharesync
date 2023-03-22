package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "沪深股通十大成交股")
public class HsgtTop10Result extends Formart {
    
    @ExplainAnnotation(comment="交易日期")
    private String trade_date;
    
    @ExplainAnnotation(comment="股票代码")
    private String ts_code;
    
    @ExplainAnnotation(comment="股票名称")
    private String name;
    
    @ExplainAnnotation(comment="收盘价")
    private String close;
    
    @ExplainAnnotation(comment="涨跌额")
    private String change;
    
    @ExplainAnnotation(comment="资金排名")
    private String rank;
    
    @ExplainAnnotation(comment="市场类型（1：沪市 3：深市）")
    private String market_type;
    
    @ExplainAnnotation(comment="成交金额（元）")
    private String amount;
    
    @ExplainAnnotation(comment="净成交金额（元）")
    private String net_amount;
    
    @ExplainAnnotation(comment="买入金额（元）")
    private String buy;
    
    @ExplainAnnotation(comment="卖出金额（元）")
    private String sell;
}
