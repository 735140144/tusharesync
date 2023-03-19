package luckyboy.params.tmt;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class TeleplayRecordParams extends Formart {
    @ExplainAnnotation(comment = "备案月份")
    private String report_date;
    @ExplainAnnotation(comment = "备案开始月份")
    private String start_date;
    @ExplainAnnotation(comment = "备案结束月份")
    private String end_date;
    @ExplainAnnotation(comment = "备案机构")
    private String org;
    @ExplainAnnotation(comment = "电视剧名称")
    private String name;
}
