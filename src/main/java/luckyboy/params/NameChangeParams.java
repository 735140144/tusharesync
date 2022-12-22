package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class NameChangeParams extends Formart {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 公告开始日期
     */
    private String start_date;
    /**
     * 公告结束日期
     */
    private String end_date;
}
