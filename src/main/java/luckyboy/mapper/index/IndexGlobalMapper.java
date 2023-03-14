package luckyboy.mapper.index;
import luckyboy.result.index.IndexGlobalResult;
import java.util.List;

public interface IndexGlobalMapper {
    int insert (List<IndexGlobalResult> indexglobalresultList);
}