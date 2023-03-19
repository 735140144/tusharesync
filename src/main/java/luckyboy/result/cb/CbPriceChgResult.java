package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "可转债转股价变动")
public class CbPriceChgResult extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String publish_date;
    @ExplainAnnotation(comment = "转债简称")
    private String bond_short_name;
    @ExplainAnnotation(comment = "变动日期")
    private String change_date;
    @ExplainAnnotation(comment = "初始转股价格")
    private String convert_price_initial;
    @ExplainAnnotation(comment = "修正前转股价格")
    private String convertprice_bef;
    @ExplainAnnotation(comment = "修正后转股价格")
    private String convertprice_aft;
}
