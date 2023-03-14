package luckyboy.mapper.index;
import luckyboy.result.index.DailyInfoResult;
import java.util.List;

public interface DailyInfoMapper {
    int insert (List<DailyInfoResult> dailyinforesultList);
}