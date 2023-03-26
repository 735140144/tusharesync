package luckyboy.schedule.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import luckyboy.schedule.vo.BaseVO;

@Data
@TableName("scheduled_corn_job")
public class ScheduledCornJobVO extends BaseVO {
    // 主键
    @TableId(type = IdType.AUTO)
    private Long id;
    // 在内存存储时的key值
    private String storeKey;
    // 外键: corn表id
    private Long cornId;
    // 外键: job表id
    private Long jobId;
    // 是否开启(0:关闭,1:开启)
    private String status;
}
