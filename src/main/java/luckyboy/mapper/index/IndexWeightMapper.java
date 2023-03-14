package luckyboy.mapper.index;
import luckyboy.result.index.IndexWeightResult;
import java.util.List;

public interface IndexWeightMapper {
    int insert (List<IndexWeightResult> indexweightresultList);
}