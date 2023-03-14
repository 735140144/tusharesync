package luckyboy.mapper.index;
import luckyboy.result.index.IndexDailybasicResult;
import java.util.List;

public interface IndexDailybasicMapper {
    int insert (List<IndexDailybasicResult> indexdailybasicresultList);
}