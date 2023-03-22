package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "融资融券交易明细")
public class MarginDetailResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code  ;
    @ExplainAnnotation(comment = "股票名称 （20190910后有数据")
    private String name;
    @ExplainAnnotation(comment = "融资余额(元)")
    private String rzye;
    @ExplainAnnotation(comment = "融券余额(元)")
    private String rqye;
    @ExplainAnnotation(comment = "融资买入额(元)")
    private String rzmre;
    @ExplainAnnotation(comment = "融券余量（手）")
    private String rqyl;
    @ExplainAnnotation(comment = "融资偿还额(元)")
    private String rzche;
    @ExplainAnnotation(comment = "融券偿还量(手)")
    private String rqchl;
    @ExplainAnnotation(comment = "融券卖出量(股,份,手)")
    private String rqmcl;
    @ExplainAnnotation(comment = "融资融券余额(元)")
    private String rzrqye;
}
