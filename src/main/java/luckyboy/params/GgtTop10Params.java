package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class GgtTop10Params extends Formart {
    /**
     * 股票代码（二选一）
     */
    private String ts_code;
    /**
     * 交易日期（二选一）
     */
    private String trade_date;
    /**
     * 开始日期
     */
    private String start_date;
    /**
     * 结束日期
     */
    private String end_date;
    /**
     *市场类型 2：港股通（沪） 4：港股通（深）
     */
    private String market_type;
}
