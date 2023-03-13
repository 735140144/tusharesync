package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.Top10HoldersResult;
import java.util.List;

public interface Top10HoldersMapper {
    int insert (List<Top10HoldersResult> top10holdersresultList);
}