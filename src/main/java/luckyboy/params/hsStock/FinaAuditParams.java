package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class FinaAuditParams extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     *公告日期
     */
    private String ann_date;
    /**
     *报告期开始日期
     */
    private String start_date;
    /**
     *报告期结束日期
     */
    private String end_date;
    /**
     *报告期(每个季度最后一天的日期,比如20171231表示年报)
     */
    private String period;
}
