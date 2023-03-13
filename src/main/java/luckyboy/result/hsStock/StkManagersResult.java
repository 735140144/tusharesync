package luckyboy.result.hsStock;

import lombok.Data;
import luckyboy.util.Formart;

@Data
public class StkManagersResult extends Formart {
    /**
     *TS股票代码
     */
    private String ts_code;
    /**
     *公告日期
     */
    private String ann_date;
    /**
     *姓名
     */
    private String name;
    /**
     *性别
     */
    private String gender;
    /**
     *岗位类别
     */
    private String lev;
    /**
     *岗位
     */
    private String title;
    /**
     *学历
     */
    private String edu;
    /**
     *国籍
     */
    private String national;
    /**
     *出生年月
     */
    private String birthday;
    /**
     *上任日期
     */
    private String begin_date;
    /**
     *离任日期
     */
    private String end_date;
    /**
     *个人简历
     */
    private String resume;
}
