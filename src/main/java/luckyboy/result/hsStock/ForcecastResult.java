package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class ForcecastResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "报告期")
    private String end_date;
    @ExplainAnnotation(comment = "业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)")
    private String type;
    @ExplainAnnotation(comment = "预告净利润变动幅度下限（%）")
    private String p_change_min;
    @ExplainAnnotation(comment = "预告净利润变动幅度上限（%）")
    private String p_change_max;
    @ExplainAnnotation(comment = "预告净利润下限（万元）")
    private String net_profit_min;
    @ExplainAnnotation(comment = "预告净利润上限（万元）")
    private String net_profit_max;
    @ExplainAnnotation(comment = "上年同期归属母公司净利润")
    private String last_parent_net;
    @ExplainAnnotation(comment = "首次公告日")
    private String first_ann_date;
    @ExplainAnnotation(comment = "业绩预告摘要")
    private String summary;
    @ExplainAnnotation(comment = "业绩变动原因")
    private String change_reason;
}
