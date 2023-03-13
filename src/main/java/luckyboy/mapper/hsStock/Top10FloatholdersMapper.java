package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.Top10FloatholdersResult;
import java.util.List;

public interface Top10FloatholdersMapper {
    int insert (List<Top10FloatholdersResult> top10floatholdersresultList);
}