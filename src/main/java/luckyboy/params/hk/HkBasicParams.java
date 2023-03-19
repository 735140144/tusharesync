package luckyboy.params.hk;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class HkBasicParams extends Formart {
    @ExplainAnnotation(comment = "TS代码")
    private String ts_code;
    @ExplainAnnotation(comment = "上市状态 L上市 D退市 P暂停上市 ，默认L")
    private String list_status;
}
