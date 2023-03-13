package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.CyqPerfResult;
import java.util.List;

public interface CyqPerfMapper {
    int insert (List<CyqPerfResult> cyqperfresultList);
}