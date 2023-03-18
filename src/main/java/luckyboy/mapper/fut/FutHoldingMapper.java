package luckyboy.mapper.fut;
import luckyboy.result.fut.FutHoldingResult;
import java.util.List;

public interface FutHoldingMapper {
    int insert (List<FutHoldingResult> futholdingresultList);
}