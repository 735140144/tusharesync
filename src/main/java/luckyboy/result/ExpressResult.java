package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class ExpressResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "报告期")
    private String end_date;
    @ExplainAnnotation(comment = "营业收入(元)")
    private String revenue;
    @ExplainAnnotation(comment = "营业利润(元)")
    private String operate_profit;
    @ExplainAnnotation(comment = "利润总额(元)")
    private String total_profit;
    @ExplainAnnotation(comment = "净利润(元)")
    private String n_income;
    @ExplainAnnotation(comment = "总资产(元)")
    private String total_assets;
    @ExplainAnnotation(comment = "股东权益合计(不含少数股东权益)(元)")
    private String total_hldr_eqy_exc_min_int;
    @ExplainAnnotation(comment = "每股收益(摊薄)(元)")
    private String diluted_eps;
    @ExplainAnnotation(comment = "净资产收益率(摊薄)(%)")
    private String diluted_roe;
    @ExplainAnnotation(comment = "去年同期修正后净利润")
    private String yoy_net_profit;
    @ExplainAnnotation(comment = "每股净资产")
    private String bps;
    @ExplainAnnotation(comment = "同比增长率:营业收入")
    private String yoy_sales;
    @ExplainAnnotation(comment = "同比增长率:营业利润")
    private String yoy_op;
    @ExplainAnnotation(comment = "同比增长率:利润总额")
    private String yoy_tp;
    @ExplainAnnotation(comment = "同比增长率:归属母公司股东的净利润")
    private String yoy_dedu_np;
    @ExplainAnnotation(comment = "同比增长率:基本每股收益")
    private String yoy_eps;
    @ExplainAnnotation(comment = "同比增减:加权平均净资产收益率")
    private String yoy_roe;
    @ExplainAnnotation(comment = "比年初增长率:总资产")
    private String growth_assets;
    @ExplainAnnotation(comment = "比年初增长率:归属母公司的股东权益")
    private String yoy_equity;
    @ExplainAnnotation(comment = "比年初增长率:归属于母公司股东的每股净资产")
    private String growth_bps;
    @ExplainAnnotation(comment = "去年同期营业收入")
    private String or_last_year;
    @ExplainAnnotation(comment = "去年同期营业利润")
    private String op_last_year;
    @ExplainAnnotation(comment = "去年同期利润总额")
    private String tp_last_year;
    @ExplainAnnotation(comment = "去年同期净利润")
    private String np_last_year;
    @ExplainAnnotation(comment = "去年同期每股收益")
    private String eps_last_year;
    @ExplainAnnotation(comment = "期初净资产")
    private String open_net_assets;
    @ExplainAnnotation(comment = "期初每股净资产")
    private String open_bps;
    @ExplainAnnotation(comment = "业绩简要说明")
    private String perf_summary;
    @ExplainAnnotation(comment = "是否审计： 1是 0否")
    private String is_audit;
    @ExplainAnnotation(comment = "备注")
    private String remark;
}
