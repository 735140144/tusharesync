package luckyboy.mapper;
import luckyboy.result.ForcecastResult;
import java.util.List;

public interface ForcecastMapper {
    int insert (List<ForcecastResult> forcecastresultList);
}