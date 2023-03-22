package luckyboy.params.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

@Data
@Builder
public class InComeParams extends Formart {

    @ExplainAnnotation(comment = " 股票代码")
    private String ts_code;

    @ExplainAnnotation(comment = " 公告日期")
    private String ann_date;

    @ExplainAnnotation(comment = " 实际公告日期")
    private String f_ann_date;

    @ExplainAnnotation(comment = "公告开始日期")
    private String start_date;

    @ExplainAnnotation(comment = "公告结束日期")
    private String end_date;

    @ExplainAnnotation(comment = "报告期")
    private String period;

    @ExplainAnnotation(comment = "报告类型")
    private String report_type;

    @ExplainAnnotation(comment = "公司类型（1一般工商业2银行3保险4证券）")
    private String comp_type;

    @ExplainAnnotation(comment = "报告期编码（1~4表示季度，e.g. 4表示年报）")
    private String end_type;
}
