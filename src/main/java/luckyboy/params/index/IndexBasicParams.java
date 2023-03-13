package luckyboy.params.index;

import luckyboy.common.ExplainAnnotation;
import luckyboy.util.Formart;

public class IndexBasicParams extends Formart {
    @ExplainAnnotation(comment = "指数代码")
    private String ts_code;
    @ExplainAnnotation(comment = "指数简称")
    private String name;
    @ExplainAnnotation(comment = "交易所或服务商(默认SSE)")
    private String market;
    @ExplainAnnotation(comment = "发布商")
    private String publisher;
    @ExplainAnnotation(comment = "指数类别")
    private String category;
}
