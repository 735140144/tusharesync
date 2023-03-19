package luckyboy.params.hk;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class HkTradecalParams extends Formart {
    @ExplainAnnotation(comment = "开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "是否交易 '0'休市 '1'交易")
    private String is_open;
}
