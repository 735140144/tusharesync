package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.DividendResult;
import java.util.List;

public interface DividendMapper {
    int insert (List<DividendResult> dividendresultList);
}