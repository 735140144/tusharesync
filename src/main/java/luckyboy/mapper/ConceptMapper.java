package luckyboy.mapper;
import luckyboy.result.ConceptResult;
import java.util.List;

public interface ConceptMapper {
    int insert (List<ConceptResult> conceptresultList);
}