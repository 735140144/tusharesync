package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.TopListResult;
import java.util.List;

public interface TopListMapper {
    int insert (List<TopListResult> toplistresultList);
}