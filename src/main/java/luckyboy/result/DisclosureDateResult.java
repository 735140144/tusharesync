package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class DisclosureDateResult extends Formart {
    private String ts_code;
    private String ann_date;
    private String end_date;
    private String pre_date;
    private String actual_date;
    private String modify_date;
}
