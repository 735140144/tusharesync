package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class StockCompanyResult extends Formart {
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 交易所代码 ，SSE上交所 SZSE深交所
     */
    private String exchange;
    /**
     * 法人代表
     */
    private String chairman;
    /**
     * 总经理
     */
    private String manager;
    /**
     * 董秘
     */
    private String secretary;
    /**
     * 注册资本
     */
    private String reg_capital;
    /**
     * 注册日期
     */
    private String setup_date;
    /**
     * 所在省份
     */
    private String province;
    /**
     * 所在城市
     */
    private String city;
    /**
     * 公司介绍
     */
    private String introduction;
    /**
     * 公司主页
     */
    private String website;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 办公室
     */
    private String office;
    /**
     * 员工人数
     */
    private String employees;
    /**
     * 主要业务及产品
     */
    private String main_business;
    /**
     * 经营范围
     */
    private String business_scope;
}
