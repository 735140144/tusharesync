package luckyboy.params.tmt;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class BoCinemaParams extends Formart {
    @ExplainAnnotation(comment = "日期")
    private String date;
}
