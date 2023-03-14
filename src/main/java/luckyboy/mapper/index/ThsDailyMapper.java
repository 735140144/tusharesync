package luckyboy.mapper.index;
import luckyboy.result.index.ThsDailyResult;
import java.util.List;

public interface ThsDailyMapper {
    int insert (List<ThsDailyResult> thsdailyresultList);
}