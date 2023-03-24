package luckyboy.result.news;

import lombok.Data;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "新闻快讯")
public class NewsResult extends Formart {
    @ExplainAnnotation(comment = "新闻时间",colType = "timestamp")
    private String datetime;
    @ExplainAnnotation(comment = "内容",colType = "varchar(65000)")
    private String content;
    @ExplainAnnotation(comment = "标题",colType = "varchar(2000)")
    private String title;
    @ExplainAnnotation(comment = "分类",colType = "varchar(2000)")
    private String channels;
}
