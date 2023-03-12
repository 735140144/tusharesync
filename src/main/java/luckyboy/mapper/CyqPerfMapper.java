package luckyboy.mapper;
import luckyboy.result.CyqPerfResult;
import java.util.List;

public interface CyqPerfMapper {
    int insert (List<CyqPerfResult> cyqperfresultList);
}