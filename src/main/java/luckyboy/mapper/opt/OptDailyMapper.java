package luckyboy.mapper.opt;
import luckyboy.result.opt.OptDailyResult;
import java.util.List;

public interface OptDailyMapper {
    int insert (List<OptDailyResult> optdailyresultList);
}