package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.TopInstResult;
import java.util.List;

public interface TopInstMapper {
    int insert (List<TopInstResult> topinstresultList);
}