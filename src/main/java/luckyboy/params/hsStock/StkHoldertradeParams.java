package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class StkHoldertradeParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "公告开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "公告结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "交易类型IN增持DE减持")
    private String trade_type;
    @ExplainAnnotation(comment = "股东类型C公司P个人G高管")
    private String holder_type;
}
