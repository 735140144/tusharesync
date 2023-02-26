package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;

@Data
@Builder
public class BalanceSheetParams extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     *公告日期
     */
    private String ann_date;
    /**
     *公告开始日期
     */
    private String start_date;
    /**
     *公告结束日期
     */
    private String end_date;
    /**
     *报告期
     */
    private String period;
    /**
     *报告类型
     */
    private String report_type;
    /**
     *公司类型：1一般工商业 2银行 3保险 4证券
     */
    private String comp_type;
    /**
     *报告期编号 （1~4表示季度，e.g. 4表示年报）
     */
    private String end_type;
}
