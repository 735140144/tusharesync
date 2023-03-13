package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class ForecastParams extends Formart {
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
     *报告期(每个季度最后一天的日期，比如20171231表示年报)
     */
    private String period;
    /**
     *预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
     */
    private String type;
}
