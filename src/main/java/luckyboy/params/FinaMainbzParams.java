package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class FinaMainbzParams extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     *报告期(每个季度最后一天的日期,比如20171231表示年报)
     */
    private String period;
    /**
     *类型：P按产品 D按地区（请输入大写字母P或者D）
     */
    private String type;
    /**
     *报告期开始日期
     */
    private String start_date;
    /**
     *报告期结束日期
     */
    private String end_date;

}
