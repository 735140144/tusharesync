package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FundCompanyResult extends Formart {
    @ExplainAnnotation(comment = "基金公司名称")
    @KeyAnnotation
    @BucketAnnotation
    private String name;
    @ExplainAnnotation(comment = "简称")
    private String shortname;
    @ExplainAnnotation(comment = "英文缩写")
    private String short_enname;
    @ExplainAnnotation(comment = "省份")
    private String province;
    @ExplainAnnotation(comment = "城市")
    private String city;
    @ExplainAnnotation(comment = "注册地址")
    private String address;
    @ExplainAnnotation(comment = "电话")
    private String phone;
    @ExplainAnnotation(comment = "办公地址")
    private String office;
    @ExplainAnnotation(comment = "公司网址")
    private String website;
    @ExplainAnnotation(comment = "法人代表")
    private String chairman;
    @ExplainAnnotation(comment = "总经理")
    private String manager;
    @ExplainAnnotation(comment = "注册资本")
    private String reg_capital;
    @ExplainAnnotation(comment = "成立日期")
    private String setup_date;
    @ExplainAnnotation(comment = "公司终止日期")
    private String end_date;
    @ExplainAnnotation(comment = "员工总数")
    private String employees;
    @ExplainAnnotation(comment = "主要产品及业务")
    private String main_business;
    @ExplainAnnotation(comment = "组织机构代码")
    private String org_code;
    @ExplainAnnotation(comment = "统一社会信用代码")
    private String credit_code;
}
