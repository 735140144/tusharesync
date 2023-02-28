package luckyboy.mapper;
import luckyboy.result.TopInstResult;
import java.util.List;

public interface TopInstMapper {
    int insert (List<TopInstResult> topinstresultList);
}