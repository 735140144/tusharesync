package luckyboy.mapper.fut;
import luckyboy.result.fut.FutMappingResult;
import java.util.List;

public interface FutMappingMapper {
    int insert (List<FutMappingResult> futmappingresultList);
}