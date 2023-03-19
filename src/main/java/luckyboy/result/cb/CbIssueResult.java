package luckyboy.result.cb;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "可转债发行")
public class CbIssueResult extends Formart {
    @ExplainAnnotation(comment = "转债代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "发行公告日")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "发行结果公告日")
    private String res_ann_date;
    @ExplainAnnotation(comment = "计划发行总额（元）")
    private String plan_issue_size;
    @ExplainAnnotation(comment = "发行总额（元）")
    private String issue_size;
    @ExplainAnnotation(comment = "发行价格")
    private String issue_price;
    @ExplainAnnotation(comment = "发行方式")
    private String issue_type;
    @ExplainAnnotation(comment = "发行费用（元）")
    private String issue_cost;
    @ExplainAnnotation(comment = "网上申购代码")
    private String onl_code;
    @ExplainAnnotation(comment = "网上申购简称")
    private String onl_name;
    @ExplainAnnotation(comment = "网上发行日期")
    private String onl_date;
    @ExplainAnnotation(comment = "网上发行总额（张）")
    private String onl_size;
    @ExplainAnnotation(comment = "网上发行有效申购数量（张）")
    private String onl_pch_vol;
    @ExplainAnnotation(comment = "网上发行有效申购户数")
    private String onl_pch_num;
    @ExplainAnnotation(comment = "网上发行超额认购倍数")
    private String onl_pch_excess;
    @ExplainAnnotation(comment = "网上发行中签率（%）")
    private String onl_winning_rate;
    @ExplainAnnotation(comment = "老股东配售代码")
    private String shd_ration_code;
    @ExplainAnnotation(comment = "老股东配售简称")
    private String shd_ration_name;
    @ExplainAnnotation(comment = "老股东配售日")
    private String shd_ration_date;
    @ExplainAnnotation(comment = "老股东配售股权登记日")
    private String shd_ration_record_date;
    @ExplainAnnotation(comment = "老股东配售缴款日")
    private String shd_ration_pay_date;
    @ExplainAnnotation(comment = "老股东配售价格")
    private String shd_ration_price;
    @ExplainAnnotation(comment = "老股东配售比例")
    private String shd_ration_ratio;
    @ExplainAnnotation(comment = "老股东配售数量（张）")
    private String shd_ration_size;
    @ExplainAnnotation(comment = "老股东配售有效申购数量（张）")
    private String shd_ration_vol;
    @ExplainAnnotation(comment = "老股东配售有效申购户数")
    private String shd_ration_num;
    @ExplainAnnotation(comment = "老股东配售超额认购倍数")
    private String shd_ration_excess;
    @ExplainAnnotation(comment = "网下发行总额（张）")
    private String offl_size;
    @ExplainAnnotation(comment = "网下发行定金比例（%）")
    private String offl_deposit;
    @ExplainAnnotation(comment = "网下发行有效申购数量（张）")
    private String offl_pch_vol;
    @ExplainAnnotation(comment = "网下发行有效申购户数")
    private String offl_pch_num;
    @ExplainAnnotation(comment = "网下发行超额认购倍数")
    private String offl_pch_excess;
    @ExplainAnnotation(comment = "网下发行中签率")
    private String offl_winning_rate;
    @ExplainAnnotation(comment = "主承销商")
    private String lead_underwriter;
    @ExplainAnnotation(comment = "主承销商包销数量（张）")
    private String lead_underwriter_vol;
}
