package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class NewShareParams extends Formart {
    /**
     * 上网发行开始日期
     */
    private String start_date;
    /**
     * 上网发行结束日期
     */
    private String end_date;
}
