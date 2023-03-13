package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class GgtDailyParams extends Formart {
    /**
     * 交易日期 （格式YYYYMMDD，下同。支持单日和多日输入）
     */
    private String trade_date;
    /**
     * 开始日期
     */
    private String start_date;
    /**
     * 结束日期
     */
    private String end_date;
}
