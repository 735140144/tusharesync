package luckyboy.mapper.cb;
import luckyboy.result.cb.CbDailyResult;
import java.util.List;

public interface CbDailyMapper {
    int insert (List<CbDailyResult> cbdailyresultList);
}