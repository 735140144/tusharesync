package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.ConceptResult;
import java.util.List;

public interface ConceptMapper {
    int insert (List<ConceptResult> conceptresultList);
}