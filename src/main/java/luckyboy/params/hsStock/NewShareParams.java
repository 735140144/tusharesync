package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class NewShareParams extends Formart {

    @ExplainAnnotation(comment = " 上网发行开始日期")
    private String start_date;

    @ExplainAnnotation(comment = " 上网发行结束日期")
    private String end_date;
}
