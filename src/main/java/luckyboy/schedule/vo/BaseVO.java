package luckyboy.schedule.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class BaseVO implements Serializable {
    // 序列化版本id
    private static final long serialVersionUID = -153746138274322843L;
    // 创建人
    private String createBy;
    // 创建时间
    private Date createTime;
    // 修改人
    private String updateBy;
    // 修改时间
    private Date updateTime;
}
