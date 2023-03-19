package luckyboy.mapper.tmt;
import luckyboy.result.tmt.BoDailyResult;
import java.util.List;

public interface BoDailyMapper {
    int insert (List<BoDailyResult> bodailyresultList);
}