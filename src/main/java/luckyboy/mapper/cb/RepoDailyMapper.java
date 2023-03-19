package luckyboy.mapper.cb;
import luckyboy.result.cb.RepoDailyResult;
import java.util.List;

public interface RepoDailyMapper {
    int insert (List<RepoDailyResult> repodailyresultList);
}