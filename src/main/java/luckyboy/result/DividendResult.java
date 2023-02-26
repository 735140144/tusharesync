package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class DividendResult extends Formart {
    private String ts_code;
    private String end_date;
    private String ann_date;
    private String div_proc;
    private String stk_div;
    private String stk_bo_rate;
    private String stk_co_rate;
    private String cash_div;
    private String cash_div_tax;
    private String record_date;
    private String ex_date;
    private String pay_date;
    private String div_listdate;
    private String imp_ann_date;
    private String base_date;
    private String base_share;
}
