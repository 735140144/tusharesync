package luckyboy.mapper;
import luckyboy.result.TopListResult;
import java.util.List;

public interface TopListMapper {
    int insert (List<TopListResult> toplistresultList);
}