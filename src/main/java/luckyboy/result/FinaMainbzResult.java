package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class FinaMainbzResult extends Formart {
    private String ts_code;
    private String end_date;
    private String bz_item;
    private String bz_sales;
    private String bz_profit;
    private String bz_cost;
    private String curr_type;
    private String update_flag;
}
