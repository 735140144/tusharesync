package luckyboy.mapper.fut;
import luckyboy.result.fut.FutIndexDailyResult;
import java.util.List;

public interface FutIndexDailyMapper {
    int insert (List<FutIndexDailyResult> futindexdailyresultList);
}