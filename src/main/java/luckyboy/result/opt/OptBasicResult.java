package luckyboy.result.opt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class OptBasicResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易市场")
    private String exchange;
    @ExplainAnnotation(comment = "合约名称")
    private String name;
    @ExplainAnnotation(comment = "合约单位")
    private String per_unit;
    @ExplainAnnotation(comment = "标准合约代码")
    private String opt_code;
    @ExplainAnnotation(comment = "合约类型")
    private String opt_type;
    @ExplainAnnotation(comment = "期权类型")
    private String call_put;
    @ExplainAnnotation(comment = "行权方式")
    private String exercise_type;
    @ExplainAnnotation(comment = "行权价格")
    private String exercise_price;
    @ExplainAnnotation(comment = "结算月")
    private String s_month;
    @ExplainAnnotation(comment = "到期日")
    private String maturity_date;
    @ExplainAnnotation(comment = "挂牌基准价")
    private String list_price;
    @ExplainAnnotation(comment = "开始交易日期")
    private String list_date;
    @ExplainAnnotation(comment = "最后交易日期")
    private String delist_date;
    @ExplainAnnotation(comment = "最后行权日期")
    private String last_edate;
    @ExplainAnnotation(comment = "最后交割日期")
    private String last_ddate;
    @ExplainAnnotation(comment = "报价单位")
    private String quote_unit;
    @ExplainAnnotation(comment = "最小价格波幅")
    private String min_price_chg;

}
