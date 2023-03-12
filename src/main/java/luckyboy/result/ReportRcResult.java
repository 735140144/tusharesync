package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class ReportRcResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "研报日期")
    @KeyAnnotation
    @BucketAnnotation
    private String report_date;
    @ExplainAnnotation(comment = "机构名称")
    @KeyAnnotation
    private String org_name;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "报告标题")
    private String report_title;
    @ExplainAnnotation(comment = "报告类型")
    private String report_type;
    @ExplainAnnotation(comment = "报告分类")
    private String classify;
    @ExplainAnnotation(comment = "作者")
    private String author_name;
    @ExplainAnnotation(comment = "预测报告期")
    private String quarter;
    @ExplainAnnotation(comment = "预测营业收入（万元）")
    private String op_rt;
    @ExplainAnnotation(comment = "预测营业利润（万元）")
    private String op_pr;
    @ExplainAnnotation(comment = "预测利润总额（万元）")
    private String tp;
    @ExplainAnnotation(comment = "预测净利润（万元）")
    private String np;
    @ExplainAnnotation(comment = "预测每股收益（元）")
    private String eps;
    @ExplainAnnotation(comment = "预测市盈率")
    private String pe;
    @ExplainAnnotation(comment = "预测股息率")
    private String rd;
    @ExplainAnnotation(comment = "预测净资产收益率")
    private String roe;
    @ExplainAnnotation(comment = "预测EV/EBITDA")
    private String ev_ebitda;
    @ExplainAnnotation(comment = "卖方评级")
    private String rating;
    @ExplainAnnotation(comment = "预测最高目标价")
    private String max_price;
    @ExplainAnnotation(comment = "预测最低目标价")
    private String min_price;
    @ExplainAnnotation(comment = "机构关注度")
    private String imp_dg;
    @ExplainAnnotation(comment = "TS数据更新时间")
    private String create_time;
}
