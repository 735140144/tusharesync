package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class StkRewardsParams extends Formart {
    /**
     * TS股票代码，支持单个或多个代码输入
     */
    private String ts_code;
    /**
     * 报告期
     */
    private String end_date;
}
