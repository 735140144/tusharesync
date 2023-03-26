package luckyboy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import luckyboy.schedule.vo.ScheduledCornJobVO;

import java.util.List;

public interface ScheduledCornJobService extends IService<ScheduledCornJobVO> {
    List<ScheduledCornJobVO> list(String status);
}
