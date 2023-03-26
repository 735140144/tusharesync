package luckyboy.schedule.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import luckyboy.schedule.vo.BaseVO;
import org.springframework.scheduling.support.CronTrigger;

@Data
@TableName("scheduled_corn")
public class ScheduledCornVO extends BaseVO {
    // 主键
    @TableId(type = IdType.AUTO)
    private Long id;
    // 任务表达式
    private String corn;
    // 表达式描述
    private String description;

    // 提供转换为CronTrigger的工具方法
    public CronTrigger toCronTrigger() {
        return new CronTrigger(this.corn);
    }
}
