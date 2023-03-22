package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "中央结算系统持股明细")
public class CcassHoldDetailResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "股票代号")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票名称")
    private String name;
    @ExplainAnnotation(comment = "参与者编号")
    private String col_participant_id;
    @ExplainAnnotation(comment = "机构名称")
    private String col_participant_name;
    @ExplainAnnotation(comment = "持股量(股)")
    private String col_shareholding;
    @ExplainAnnotation(comment = "占已发行股份/权证/单位百分比(%)")
    private String col_shareholding_percent;
}
