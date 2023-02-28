package luckyboy.mapper;
import luckyboy.result.Top10FloatholdersResult;
import java.util.List;

public interface Top10FloatholdersMapper {
    int insert (List<Top10FloatholdersResult> top10floatholdersresultList);
}