package luckyboy.service.Impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import luckyboy.mapper.scheduled.ScheduledCornJobMapper;
import luckyboy.schedule.vo.ScheduledCornJobVO;
import luckyboy.service.ScheduledCornJobService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduledCornJobServiceImpl extends ServiceImpl<ScheduledCornJobMapper, ScheduledCornJobVO> implements ScheduledCornJobService {
    @Override
    public List<ScheduledCornJobVO> list(String status) {
        return new LambdaQueryChainWrapper<>(getBaseMapper()).eq(ScheduledCornJobVO::getStatus, status).list();
    }
}
