package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class MoneyFlowHsgtParams extends Formart {
    /**
     * 交易日期 (二选一)
     */
    private String trade_date;
    /**
     * 开始日期 (二选一)
     */
    private String start_date;
    /**
     * 结束日期
     */
    private String end_date;
}
