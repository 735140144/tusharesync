package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.ForcecastResult;
import java.util.List;

public interface ForcecastMapper {
    int insert (List<ForcecastResult> forcecastresultList);
}