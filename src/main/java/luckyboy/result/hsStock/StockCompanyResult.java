package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "上市公司基本信息")
public class StockCompanyResult extends Formart {

    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;

    @ExplainAnnotation(comment = "交易所代码 ，SSE上交所 SZSE深交所")
    private String exchange;

    @ExplainAnnotation(comment = "法人代表")
    private String chairman;

    @ExplainAnnotation(comment = "总经理")
    private String manager;

    @ExplainAnnotation(comment = "董秘")
    private String secretary;

    @ExplainAnnotation(comment = "注册资本")
    private String reg_capital;

    @ExplainAnnotation(comment = "注册日期")
    private String setup_date;

    @ExplainAnnotation(comment = "所在省份")
    private String province;

    @ExplainAnnotation(comment = "所在城市")
    private String city;

    @ExplainAnnotation(comment = "公司介绍")
    private String introduction;

    @ExplainAnnotation(comment = "公司主页")
    private String website;

    @ExplainAnnotation(comment = "电子邮件")
    private String email;

    @ExplainAnnotation(comment = "办公室")
    private String office;

    @ExplainAnnotation(comment = "员工人数")
    private String employees;

    @ExplainAnnotation(comment = "主要业务及产品")
    private String main_business;

    @ExplainAnnotation(comment = "经营范围")
    private String business_scope;
}
