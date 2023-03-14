package luckyboy.mapper.index;
import luckyboy.result.index.IndexWeeklyResult;
import java.util.List;

public interface IndexWeeklyMapper {
    int insert (List<IndexWeeklyResult> indexweeklyresultList);
}