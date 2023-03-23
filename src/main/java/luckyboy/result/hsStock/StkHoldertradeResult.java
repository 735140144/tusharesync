package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "股东增减持")
public class StkHoldertradeResult extends Formart {
    @ExplainAnnotation(comment = "代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "公告日期")
    @KeyAnnotation
    private String ann_date;
    @ExplainAnnotation(comment = "股东名称")
    @KeyAnnotation
    private String holder_name;
    @ExplainAnnotation(comment = "股东类型G高管P个人C公司")
    private String holder_type;
    @ExplainAnnotation(comment = "类型IN增持DE减持")
    private String in_de;
    @ExplainAnnotation(comment = "变动数量")
    private String change_vol;
    @ExplainAnnotation(comment = "占流通比例（%）")
    private String change_ratio;
    @ExplainAnnotation(comment = "变动后持股")
    private String after_share;
    @ExplainAnnotation(comment = "变动后占流通比例（%）")
    private String after_ratio;
    @ExplainAnnotation(comment = "平均价格")
    private String avg_price;
    @ExplainAnnotation(comment = "持股总数")
    private String total_share;
    @ExplainAnnotation(comment = "增减持开始日期")
    private String begin_date;
    @ExplainAnnotation(comment = "增减持结束日期")
    private String close_date;

}
