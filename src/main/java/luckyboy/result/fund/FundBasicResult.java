package luckyboy.result.fund;

import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.Formart;
@Data
public class FundBasicResult extends Formart {
    @ExplainAnnotation(comment = "基金代码")
    @KeyAnnotation
    @BucketAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "简称")
    private String name;
    @ExplainAnnotation(comment = "管理人")
    private String management;
    @ExplainAnnotation(comment = "托管人")
    private String custodian;
    @ExplainAnnotation(comment = "投资类型")
    private String fund_type;
    @ExplainAnnotation(comment = "成立日期")
    private String found_date;
    @ExplainAnnotation(comment = "到期日期")
    private String due_date;
    @ExplainAnnotation(comment = "上市时间")
    private String list_date;
    @ExplainAnnotation(comment = "发行日期")
    private String issue_date;
    @ExplainAnnotation(comment = "退市日期")
    private String delist_date;
    @ExplainAnnotation(comment = "发行份额(亿)")
    private String issue_amount;
    @ExplainAnnotation(comment = "管理费")
    private String m_fee;
    @ExplainAnnotation(comment = "托管费")
    private String c_fee;
    @ExplainAnnotation(comment = "存续期")
    private String duration_year;
    @ExplainAnnotation(comment = "面值")
    private String p_value;
    @ExplainAnnotation(comment = "起点金额(万元)")
    private String min_amount;
    @ExplainAnnotation(comment = "预期收益率")
    private String exp_return;
    @ExplainAnnotation(comment = "业绩比较基准")
    private String benchmark;
    @ExplainAnnotation(comment = "存续状态D摘牌 I发行 L已上市")
    private String status;
    @ExplainAnnotation(comment = "投资风格")
    private String invest_type;
    @ExplainAnnotation(comment = "基金类型")
    private String type;
    @ExplainAnnotation(comment = "受托人")
    private String trustee;
    @ExplainAnnotation(comment = "日常申购起始日")
    private String purc_startdate;
    @ExplainAnnotation(comment = "日常赎回起始日")
    private String redm_startdate;
    @ExplainAnnotation(comment = "E场内O场外")
    private String market;
}
