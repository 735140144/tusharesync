package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;


@Data
@ResultComment(comment = "股票列表")
public class StockBasicResult extends Formart {

    @ExplainAnnotation(comment = "TS代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "股票代码")
    private String symbol;

    @ExplainAnnotation(comment = "股票名称")
    private String name;

    @ExplainAnnotation(comment = "地域")
    private String area;

    @ExplainAnnotation(comment = "所属行业")
    private String industry;

    @ExplainAnnotation(comment = "股票全称")
    private String fullname;

    @ExplainAnnotation(comment = "英文全称")
    private String enname;

    @ExplainAnnotation(comment = "拼音缩写")
    private String cnspell;

    @ExplainAnnotation(comment = "市场类型（主板/创业板/科创板/CDR）")
    private String market;

    @ExplainAnnotation(comment = "交易所代码")
    private String exchange;

    @ExplainAnnotation(comment = "交易货币")
    private String curr_type;
    @ExplainAnnotation(comment = " 上市状态 L上市 D退市 P暂停上市")
    private String list_status;

    @ExplainAnnotation(comment = "上市日期")
    private String list_date;

    @ExplainAnnotation(comment = "退市日期")
    private String delist_date;

    @ExplainAnnotation(comment = "是否沪深港通标的，N否 H沪股通 S深股通")
    private String is_hs;


}
