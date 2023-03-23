package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;

@Data
@ResultComment(comment = "公募基金持仓数据")
public class FundPortfolioResult extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "截止日期")
    private String end_date;
    @ExplainAnnotation(comment = "股票代码")
    private String symbol;
    @ExplainAnnotation(comment = "持有股票市值(元)")
    private String mkv;
    @ExplainAnnotation(comment = "持有股票数量（股）")
    private String amount;
    @ExplainAnnotation(comment = "占股票市值比")
    private String stk_mkv_ratio;
    @ExplainAnnotation(comment = "占流通股本比例")
    private String stk_float_ratio;
}
