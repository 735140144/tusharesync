package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class MarginParams extends Formart {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     *交易所代码
     */
    private String exchange_id;
    /**
     *开始日期
     */
    private String start_date;
    /**
     *结束日期
     */
    private String end_date;
}
