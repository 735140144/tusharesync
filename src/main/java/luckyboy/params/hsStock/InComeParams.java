package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;

@Data
@Builder
public class InComeParams extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 实际公告日期
     */
    private String f_ann_date;
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
     *公司类型（1一般工商业2银行3保险4证券）
     */
    private String comp_type;
    /**
     *报告期编码（1~4表示季度，e.g. 4表示年报）
     */
    private String end_type;
}
