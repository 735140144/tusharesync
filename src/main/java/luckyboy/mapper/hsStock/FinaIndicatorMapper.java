package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.FinaIndicatorResult;
import java.util.List;

public interface FinaIndicatorMapper {
    int insert (List<FinaIndicatorResult> finaindicatorresultList);
}