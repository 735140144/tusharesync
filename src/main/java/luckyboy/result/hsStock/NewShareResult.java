package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "IPO新股列表")
public class NewShareResult extends Formart {

    @ExplainAnnotation(comment = "TS股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "申购代码")
    private String sub_code;

    @ExplainAnnotation(comment = "名称")
    private String name;

    @ExplainAnnotation(comment = "上网发行日期")
    private String ipo_date;

    @ExplainAnnotation(comment = "上市日期")
    private String issue_date;

    @ExplainAnnotation(comment = "发行总量（万股）")
    private String amount;

    @ExplainAnnotation(comment = "上网发行总量（万股）")
    private String market_amount;

    @ExplainAnnotation(comment = "发行价格")
    private String price;

    @ExplainAnnotation(comment = "市盈率")
    private String pe;

    @ExplainAnnotation(comment = "个人申购上限（万股）")
    private String limit_amount;

    @ExplainAnnotation(comment = "募集资金（亿元）")
    private String funds;

    @ExplainAnnotation(comment = "	中签率")
    private String ballot;
}
