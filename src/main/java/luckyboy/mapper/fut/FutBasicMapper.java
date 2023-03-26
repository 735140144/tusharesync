package luckyboy.mapper.fut;
import luckyboy.result.fut.FutBasicResult;
import java.util.List;

public interface FutBasicMapper {
    int insert (List<FutBasicResult> futbasicresultList);

    List<FutBasicResult> getall();
}