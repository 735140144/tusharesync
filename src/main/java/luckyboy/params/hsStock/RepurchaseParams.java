package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class RepurchaseParams extends Formart {
    @ExplainAnnotation(comment = "公告日期")
    private String ann_date;
    @ExplainAnnotation(comment = "公告开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "公告结束日期")
    private String end_date;

}
