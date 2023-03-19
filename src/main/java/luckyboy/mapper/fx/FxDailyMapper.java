package luckyboy.mapper.fx;
import luckyboy.result.fx.FxDailyResult;
import java.util.List;

public interface FxDailyMapper {
    int insert (List<FxDailyResult> fxdailyresultList);
}