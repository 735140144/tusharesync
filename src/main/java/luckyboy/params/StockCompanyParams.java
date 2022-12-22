package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class StockCompanyParams extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 交易所代码 ，SSE上交所 SZSE深交所
     */
    @Builder.Default
    private String exchange = "";
}
