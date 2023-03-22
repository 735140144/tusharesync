package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
@Builder
public class TradeCalParams extends Formart {

    @ExplainAnnotation(comment = " 交易所 SSE上交所,SZSE深交所,CFFEX 中金所,SHFE 上期所,CZCE 郑商所,DCE 大商所,INE 上能源")
    @Builder.Default
    private String exchange="";


    @ExplainAnnotation(comment = " 开始日期 （格式：YYYYMMDD 下同）")
    private String start_date;

    @ExplainAnnotation(comment = " 结束日期")
    private String end_date;

    @ExplainAnnotation(comment = " 是否交易 '0'休市 '1'交易")
    private String is_open;
}
