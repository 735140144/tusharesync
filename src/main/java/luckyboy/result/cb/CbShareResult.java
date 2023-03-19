package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "可转债转股结果")
public class CbShareResult extends Formart {
    @ExplainAnnotation(comment = "债券代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String publish_date;
    @ExplainAnnotation(comment = "债券简称")
    private String bond_short_name;
    @ExplainAnnotation(comment = "统计截止日期")
    private String end_date;
    @ExplainAnnotation(comment = "可转债发行总额")
    private String issue_size;
    @ExplainAnnotation(comment = "初始转换价格")
    private String convert_price_initial;
    @ExplainAnnotation(comment = "本次转换价格")
    private String convert_price;
    @ExplainAnnotation(comment = "本次转股金额")
    private String convert_val;
    @ExplainAnnotation(comment = "本次转股数量")
    private String convert_vol;
    @ExplainAnnotation(comment = "本次转股比例")
    private String convert_ratio;
    @ExplainAnnotation(comment = "累计转股金额")
    private String acc_convert_val;
    @ExplainAnnotation(comment = "累计转股数量")
    private String acc_convert_vol;
    @ExplainAnnotation(comment = "累计转股比例")
    private String acc_convert_ratio;
    @ExplainAnnotation(comment = "可转债剩余金额")
    private String remain_size;
    @ExplainAnnotation(comment = "转股后总股本")
    private String total_shares;
}
