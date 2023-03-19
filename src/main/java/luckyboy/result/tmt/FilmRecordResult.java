package luckyboy.result.tmt;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "全国电影剧本备案数据")
public class FilmRecordResult extends Formart {
    @ExplainAnnotation(comment = "备案号")
    @KeyAnnotation
    @BucketAnnotation
    private String rec_no;
    @ExplainAnnotation(comment = "影片名称")
    @KeyAnnotation
    private String film_name;
    @ExplainAnnotation(comment = "备案单位")
    private String rec_org;
    @ExplainAnnotation(comment = "编剧")
    private String script_writer;
    @ExplainAnnotation(comment = "备案结果")
    private String rec_result;
    @ExplainAnnotation(comment = "备案地（备案时间）")
    private String rec_area;
    @ExplainAnnotation(comment = "影片分类")
    private String classified;
    @ExplainAnnotation(comment = "备案日期区间")
    private String date_range;
    @ExplainAnnotation(comment = "备案结果发布时间")
    private String ann_date;
}
