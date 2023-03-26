package luckyboy.schedule.vo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import luckyboy.schedule.vo.BaseVO;

@Data
@TableName("scheduled_job")
public class ScheduledJobVO extends BaseVO {
    // 主键
    @TableId(type = IdType.AUTO)
    private Long id;
    // 执行具体工作的bean名称
    private String beanName;
    // 工作描述
    private String description;
}

