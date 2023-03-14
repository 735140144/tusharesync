package luckyboy.mapper.index;
import luckyboy.result.index.IndexClassifyResult;
import java.util.List;

public interface IndexClassifyMapper {
    int insert (List<IndexClassifyResult> indexclassifyresultList);
}