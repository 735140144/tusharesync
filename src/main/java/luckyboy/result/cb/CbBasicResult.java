package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "可转债基本信息")
public class CbBasicResult extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "转债名称")
    private String bond_full_name;
    @ExplainAnnotation(comment = "转债简称")
    private String bond_short_name;
    @ExplainAnnotation(comment = "转股申报代码")
    private String cb_code;
    @ExplainAnnotation(comment = "正股代码")
    private String stk_code;
    @ExplainAnnotation(comment = "正股简称")
    private String stk_short_name;
    @ExplainAnnotation(comment = "发行期限（年）")
    private String maturity;
    @ExplainAnnotation(comment = "面值")
    private String par;
    @ExplainAnnotation(comment = "发行价格")
    private String issue_price;
    @ExplainAnnotation(comment = "发行总额（元）")
    private String issue_size;
    @ExplainAnnotation(comment = "债券余额（元）")
    private String remain_size;
    @ExplainAnnotation(comment = "起息日期")
    private String value_date;
    @ExplainAnnotation(comment = "到期日期")
    private String maturity_date;
    @ExplainAnnotation(comment = "利率类型")
    private String rate_type;
    @ExplainAnnotation(comment = "票面利率（%）")
    private String coupon_rate;
    @ExplainAnnotation(comment = "补偿利率（%）")
    private String add_rate;
    @ExplainAnnotation(comment = "年付息次数")
    private String pay_per_year;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
    @ExplainAnnotation(comment = "摘牌日")
    private String delist_date;
    @ExplainAnnotation(comment = "上市地点")
    private String exchange;
    @ExplainAnnotation(comment = "转股起始日")
    private String conv_start_date;
    @ExplainAnnotation(comment = "转股截止日")
    private String conv_end_date;
    @ExplainAnnotation(comment = "停止转股日(提前到期)")
    private String conv_stop_date;
    @ExplainAnnotation(comment = "初始转股价")
    private String first_conv_price;
    @ExplainAnnotation(comment = "最新转股价")
    private String conv_price;
    @ExplainAnnotation(comment = "利率说明")
    private String rate_clause;
    @ExplainAnnotation(comment = "赎回条款")
    private String put_clause;
    @ExplainAnnotation(comment = "到期赎回价格(含税)")
    private String maturity_put_price;
    @ExplainAnnotation(comment = "回售条款")
    private String call_clause;
    @ExplainAnnotation(comment = "特别向下修正条款",colType = "varchar(65000)")
    private String reset_clause;
    @ExplainAnnotation(comment = "转股条款",colType = "varchar(65000)")
    private String conv_clause;
    @ExplainAnnotation(comment = "担保人")
    private String guarantor;
    @ExplainAnnotation(comment = "担保方式")
    private String guarantee_type;
    @ExplainAnnotation(comment = "发行信用等级")
    private String issue_rating;
    @ExplainAnnotation(comment = "最新信用等级")
    private String newest_rating;
    @ExplainAnnotation(comment = "最新评级机构")
    private String rating_comp;
}
