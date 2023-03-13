package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class DailyBasicParams extends Formart {
    /**
     * 股票代码（二选一）
     */
    private String ts_code;
    /**
     * 交易日期 （二选一）
     */
    private String trade_date;
    /**
     * 开始日期(YYYYMMDD)
     */
    private String start_date;
    /**
     * 结束日期(YYYYMMDD)
     */
    private String end_date;
}
