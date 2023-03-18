package luckyboy.params.sge;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class SgeBasicParams extends Formart {
    @ExplainAnnotation(comment = "合约代码 （支持多个，逗号分隔，不输入为获取全部）")
    private String ts_code;
}
