package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class GgtDailyParams extends Formart {

    @ExplainAnnotation(comment = " 交易日期 （格式YYYYMMDD，下同。支持单日和多日输入）")
    private String trade_date;

    @ExplainAnnotation(comment = " 开始日期")
    private String start_date;

    @ExplainAnnotation(comment = " 结束日期")
    private String end_date;
}
