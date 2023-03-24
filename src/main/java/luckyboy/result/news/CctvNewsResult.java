package luckyboy.result.news;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "新闻联播")
public class CctvNewsResult extends Formart {
    @ExplainAnnotation(comment = "日期")
    private String date;
    @ExplainAnnotation(comment = "标题")
    private String title;
    @ExplainAnnotation(comment = "内容",colType = "varchar(65000)")
    private String content;
}
