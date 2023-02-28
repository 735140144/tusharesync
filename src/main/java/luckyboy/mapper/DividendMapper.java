package luckyboy.mapper;
import luckyboy.result.DividendResult;
import java.util.List;

public interface DividendMapper {
    int insert (List<DividendResult> dividendresultList);
}