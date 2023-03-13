package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;

/**
 * 股票列表入参
 */
@Data
@Builder
public class StockBasicParams extends Formart {
    /**
     * 是否沪深港通标的，N否 H沪股通 S深股通
     */
    private String is_hs;
    /**
     * 上市状态 L上市 D退市 P暂停上市，默认是L
     */
    @Builder.Default
    private String list_status = "L";
    /**
     * 交易所 SSE上交所 SZSE深交所 BSE北交所
     */
    @Builder.Default
    private String exchange ="";
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 市场类别 （主板/创业板/科创板/CDR/北交所）
     */
    private String market;

    private String limit;

    private String offset;
    /**
     * 名称
     */
    private String name;

}
