package luckyboy.mapper.index;
import luckyboy.result.index.IndexMonthlyResult;
import java.util.List;

public interface IndexMonthlyMapper {
    int insert (List<IndexMonthlyResult> indexmonthlyresultList);
}