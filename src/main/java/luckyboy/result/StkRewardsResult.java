package luckyboy.result;

import lombok.Data;
import luckyboy.util.Formart;
@Data
public class StkRewardsResult extends Formart {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 截止日期
     */
    private String end_date;
    /**
     * 姓名
     */
    private String name;
    /**
     * 职务
     */
    private String title;
    /**
     * 报酬
     */
    private String reward;
    /**
     * 持股数
     */
    private String hold_vol;
}
