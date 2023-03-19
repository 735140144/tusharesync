package luckyboy.result.hk;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "港股列表")
public class HkBasicResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "股票简称")
    private String name;
    @ExplainAnnotation(comment = "公司全称")
    private String fullname;
    @ExplainAnnotation(comment = "英文名称")
    private String enname;
    @ExplainAnnotation(comment = "拼音")
    private String cn_spell;
    @ExplainAnnotation(comment = "市场类别")
    private String market;
    @ExplainAnnotation(comment = "上市状态")
    private String list_status;
    @ExplainAnnotation(comment = "上市日期")
    private String list_date;
    @ExplainAnnotation(comment = "退市日期")
    private String delist_date;
    @ExplainAnnotation(comment = "交易单位")
    private String trade_unit;
    @ExplainAnnotation(comment = "ISIN代码")
    private String isin;
    @ExplainAnnotation(comment = "货币代码")
    private String curr_type;
}
