package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class ExpressResult extends Formart {
    private String ts_code;
    private String ann_date;
    private String end_date;
    private String revenue;
    private String operate_profit;
    private String total_profit;
    private String n_income;
    private String total_assets;
    private String total_hldr_eqy_exc_min_int;
    private String diluted_eps;
    private String diluted_roe;
    private String yoy_net_profit;
    private String bps;
    private String yoy_sales;
    private String yoy_op;
    private String yoy_tp;
    private String yoy_dedu_np;
    private String yoy_eps;
    private String yoy_roe;
    private String growth_assets;
    private String yoy_equity;
    private String growth_bps;
    private String or_last_year;
    private String op_last_year;
    private String tp_last_year;
    private String np_last_year;
    private String eps_last_year;
    private String open_net_assets;
    private String open_bps;
    private String perf_summary;
    private String is_audit;
    private String remark;
}
