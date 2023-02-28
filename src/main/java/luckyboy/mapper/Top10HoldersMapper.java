package luckyboy.mapper;
import luckyboy.result.Top10HoldersResult;
import java.util.List;

public interface Top10HoldersMapper {
    int insert (List<Top10HoldersResult> top10holdersresultList);
}