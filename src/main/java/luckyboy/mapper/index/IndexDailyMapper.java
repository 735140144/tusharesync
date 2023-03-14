package luckyboy.mapper.index;
import luckyboy.result.index.IndexDailyResult;
import java.util.List;

public interface IndexDailyMapper {
    int insert (List<IndexDailyResult> indexdailyresultList);
}