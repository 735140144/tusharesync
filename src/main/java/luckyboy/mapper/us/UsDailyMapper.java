package luckyboy.mapper.us;
import luckyboy.result.us.UsDailyResult;
import java.util.List;

public interface UsDailyMapper {
    int insert (List<UsDailyResult> usdailyresultList);
}