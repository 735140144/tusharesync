package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class GgtMonthlyParams extends Formart {
    /**
     * 月度（格式YYYYMM，下同，支持多个输入）
     */
    private String month;
    /**
     * 开始月度
     */
    private String start_month;
    /**
     * 结束月度
     */
    private String end_month;
}
