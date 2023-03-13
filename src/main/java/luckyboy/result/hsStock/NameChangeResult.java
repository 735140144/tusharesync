package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;

@Data
public class NameChangeResult extends Formart {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 证券名称
     */
    private String name;
    /**
     * 开始日期
     */
    private String start_date;
    /**
     * 结束日期
     */
    private String end_date;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 变更原因
     */
    private String change_reason;
}
