package luckyboy.mapper.fut;
import luckyboy.result.fut.FutDailyResult;
import java.util.List;

public interface FutDailyMapper {
    int insert (List<FutDailyResult> futdailyresultList);
}