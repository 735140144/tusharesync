package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "公募基金净值")
public class FundNavResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    @BucketAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "净值日期")
    private String nav_date;
    @ExplainAnnotation(comment = "单位净值")
    private String unit_nav;
    @ExplainAnnotation(comment = "累计净值")
    private String accum_nav;
    @ExplainAnnotation(comment = "累计分红")
    private String accum_div;
    @ExplainAnnotation(comment = "资产净值")
    private String net_asset;
    @ExplainAnnotation(comment = "合计资产净值")
    private String total_netasset;
    @ExplainAnnotation(comment = "复权单位净值")
    private String adj_nav;
}
