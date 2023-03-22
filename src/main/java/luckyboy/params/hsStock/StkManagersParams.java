package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;
@Data
@Builder
public class StkManagersParams extends Formart {

    @ExplainAnnotation(comment = " 股票代码，支持单个或多个股票输入")
    private String ts_code;

    @ExplainAnnotation(comment = " 公告日期（YYYYMMDD格式，下同）")
    private String ann_date;

    @ExplainAnnotation(comment = " 公告开始日期")
    private String start_date;

    @ExplainAnnotation(comment = " 公告结束日期")
    private String end_date;
}
