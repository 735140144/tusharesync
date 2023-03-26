package luckyboy.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import luckyboy.mapper.scheduled.ScheduledCornMapper;
import luckyboy.schedule.vo.ScheduledCornVO;
import luckyboy.service.ScheduledCornService;
import org.springframework.stereotype.Service;

@Service
public class ScheduledCornServiceImpl extends ServiceImpl<ScheduledCornMapper, ScheduledCornVO> implements ScheduledCornService {
}
