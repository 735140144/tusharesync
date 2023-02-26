package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;

@Data
@Builder
public class DividendParams extends Formart {
    /**
     * 代码
     */
    private String ts_code;
    /**
     *公告日
     */
    private String ann_date;
    /**
     *股权登记日期
     */
    private String record_date;
    /**
     *除权除息日
     */
    private String ex_date;
    /**
     *	实施公告日
     */
    private String imp_ann_date;
}
