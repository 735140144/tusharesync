package luckyboy.mapper.index;
import luckyboy.result.index.IndexBasicResult;
import java.util.List;

public interface IndexBasicMapper {
    int insert (List<IndexBasicResult> indexbasicresultList);

    List<IndexBasicResult> getAll();
}