package luckyboy.mapper.index;
import luckyboy.result.index.ThsIndexResult;
import java.util.List;

public interface ThsIndexMapper {
    int insert (List<ThsIndexResult> thsindexresultList);

    List<ThsIndexResult> selectAll();
}