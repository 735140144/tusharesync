package luckyboy.mapper.fut;
import luckyboy.result.fut.FutWeeklyDetailResult;
import java.util.List;

public interface FutWeeklyDetailMapper {
    int insert (List<FutWeeklyDetailResult> futweeklydetailresultList);
}