package luckyboy.result.sge;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class SgeBasicResult extends Formart {
    @ExplainAnnotation(comment = "品种代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "品种名称")
    private String ts_name;
    @ExplainAnnotation(comment = "交易类型")
    private String trade_type;
    @ExplainAnnotation(comment = "交易单位(克/手)")
    private String t_unit;
    @ExplainAnnotation(comment = "报价单位")
    private String p_unit;
    @ExplainAnnotation(comment = "最小变动价位")
    private String min_change;
    @ExplainAnnotation(comment = "每日价格最大波动限制")
    private String price_limit;
    @ExplainAnnotation(comment = "最小单笔报价量(手)")
    private String min_vol;
    @ExplainAnnotation(comment = "最大单笔报价量(手)")
    private String max_vol;
    @ExplainAnnotation(comment = "交易期限")
    private String trade_mode;
    @ExplainAnnotation(comment = "保证金比例")
    private String margin_rate;
    @ExplainAnnotation(comment = "违约金比例(%)")
    private String liq_rate;
    @ExplainAnnotation(comment = "交易时间")
    private String trade_time;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
}
