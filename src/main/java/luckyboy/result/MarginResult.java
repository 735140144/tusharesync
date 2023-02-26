package luckyboy.result;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

import java.lang.annotation.Documented;

@Data
public class MarginResult extends Formart {
    @ExplainAnnotation(comment="交易日期")
    private String trade_date;
    @ExplainAnnotation(comment="交易所代码（SSE上交所SZSE深交所")
    private String exchange_id;
    @ExplainAnnotation(comment="融资余额(元)")
    private String rzye;
    @ExplainAnnotation(comment="融资买入额(元)")
    private String rzmre;
    @ExplainAnnotation(comment="融资偿还额(元)")
    private String rzche;
    @ExplainAnnotation(comment="融券余额(元)")
    private String rqye;
    @ExplainAnnotation(comment="融券卖出量(股,份,手)")
    private String rqmcl;
    @ExplainAnnotation(comment="融资融券余额(元)")
    private String rzrqye;
    @ExplainAnnotation(comment="融券余量(股,份,手)")
    private String rqyl;
}
