package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "沪深港通资金流向")
public class MoneyFlowHsgtResult extends Formart {
    
    @ExplainAnnotation(comment="交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    
    @ExplainAnnotation(comment="港股通（上海）")
    private String ggt_ss;
    
    @ExplainAnnotation(comment="港股通（深圳）")
    private String ggt_sz;
    
    @ExplainAnnotation(comment="沪股通（百万元）")
    private String hgt;
    
    @ExplainAnnotation(comment="深股通（百万元）")
    private String sgt;
    
    @ExplainAnnotation(comment="北向资金（百万元）")
    private String north_money;
    
    @ExplainAnnotation(comment="南向资金（百万元）")
    private String south_money;
}
