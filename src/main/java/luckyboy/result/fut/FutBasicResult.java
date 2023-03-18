package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FutBasicResult extends Formart {
    @ExplainAnnotation(comment = "合约代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易标识")
    private String symbol;
    @ExplainAnnotation(comment = "交易市场")
    private String exchange;
    @ExplainAnnotation(comment = "中文简称")
    private String name;
    @ExplainAnnotation(comment = "合约产品代码")
    private String fut_code;
    @ExplainAnnotation(comment = "合约乘数(只适用于国债期货、指数期货)")
    private String multiplier;
    @ExplainAnnotation(comment = "交易计量单位")
    private String trade_unit;
    @ExplainAnnotation(comment = "交易单位(每手)")
    private String per_unit;
    @ExplainAnnotation(comment = "报价单位")
    private String quote_unit;
    @ExplainAnnotation(comment = "最小报价单位说明")
    private String quote_unit_desc;
    @ExplainAnnotation(comment = "交割方式说明")
    private String d_mode_desc;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
    @ExplainAnnotation(comment = "最后交易日期")
    private String delist_date;
    @ExplainAnnotation(comment = "交割月份")
    private String d_month;
    @ExplainAnnotation(comment = "最后交割日")
    private String last_ddate;
    @ExplainAnnotation(comment = "交易时间说明")
    private String trade_time_desc;
}
