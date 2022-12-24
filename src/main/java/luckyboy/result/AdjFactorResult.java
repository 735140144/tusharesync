package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class AdjFactorResult extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 复权因子
     */
    private String adj_factor;
}
