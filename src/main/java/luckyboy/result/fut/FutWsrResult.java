package luckyboy.result.fut;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FutWsrResult extends Formart {
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "产品代码")
    @KeyAnnotation
    private String symbol;
    @ExplainAnnotation(comment = "产品名称")
    private String fut_name;
    @ExplainAnnotation(comment = "仓库名称")
    private String warehouse;
    @ExplainAnnotation(comment = "仓库编号")
    private String wh_id;
    @ExplainAnnotation(comment = "昨日仓单量")
    private String pre_vol;
    @ExplainAnnotation(comment = "今日仓单量")
    private String vol;
    @ExplainAnnotation(comment = "增减量")
    private String vol_chg;
    @ExplainAnnotation(comment = "地区")
    private String area;
    @ExplainAnnotation(comment = "年度")
    private String year;
    @ExplainAnnotation(comment = "等级")
    private String grade;
    @ExplainAnnotation(comment = "品牌")
    private String brand;
    @ExplainAnnotation(comment = "产地")
    private String place;
    @ExplainAnnotation(comment = "升贴水")
    private String pd;
    @ExplainAnnotation(comment = "是否折算仓单")
    private String is_ct;
    @ExplainAnnotation(comment = "单位")
    private String unit;
    @ExplainAnnotation(comment = "交易所")
    private String exchange;
}
