package luckyboy.result;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class PledgeDetailResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "股东名称")
    @KeyAnnotation
    private String holder_name;
    @ExplainAnnotation(comment = "质押数量（万股）")
    @KeyAnnotation
    private String pledge_amount;
    @ExplainAnnotation(comment = "质押开始日期")
    private String start_date;
    @ExplainAnnotation(comment = "质押结束日期")
    private String end_date;
    @ExplainAnnotation(comment = "是否已解押")
    private String is_release;
    @ExplainAnnotation(comment = "解押日期")
    private String release_date;
    @ExplainAnnotation(comment = "质押方")
    private String pledgor;
    @ExplainAnnotation(comment = "持股总数（万股）")
    private String holding_amount;
    @ExplainAnnotation(comment = "质押总数（万股）")
    private String pledged_amount;
    @ExplainAnnotation(comment = "本次质押占总股本比例")
    private String p_total_ratio;
    @ExplainAnnotation(comment = "持股总数占总股本比例")
    private String h_total_ratio;
    @ExplainAnnotation(comment = "是否回购")
    private String is_buyback;
}
