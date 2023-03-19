package luckyboy.params.tmt;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FilmRecordParams extends Formart {
    @ExplainAnnotation(comment = "公布日期")
    private String ann_date;
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
}
