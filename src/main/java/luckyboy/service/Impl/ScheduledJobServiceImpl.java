package luckyboy.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import luckyboy.mapper.scheduled.ScheduledJobMapper;
import luckyboy.schedule.vo.ScheduledJobVO;
import luckyboy.service.ScheduledJobService;
import org.springframework.stereotype.Service;

@Service
public class ScheduledJobServiceImpl extends ServiceImpl<ScheduledJobMapper, ScheduledJobVO> implements ScheduledJobService {
}
