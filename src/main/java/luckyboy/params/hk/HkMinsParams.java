package luckyboy.params.hk;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class HkMinsParams extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    private String ts_code;
    @ExplainAnnotation(comment = "分钟频度（1min/5min/15min/30min/60min）")
    private String freq;
    @ExplainAnnotation(comment = "开始日期 格式：2023-03-13 09:00:00")
    private String start_date;
    @ExplainAnnotation(comment = "结束时间 格式：2023-03-13 19:00:00")
    private String end_date;
}
