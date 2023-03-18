package luckyboy.params.fut;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class FutBasicParams extends Formart {
    @ExplainAnnotation(comment = "交易所代码 CFFEX-中金所 DCE-大商所 CZCE-郑商所 SHFE-上期所 INE-上海国际能源交易中心 GFEX-广州期货交易所")
    private String exchange;
    @ExplainAnnotation(comment = "合约类型 (1 普通合约 2主力与连续合约 默认取全部)")
    private String fut_type;
}
