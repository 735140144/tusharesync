package luckyboy.mapper.sge;
import luckyboy.result.sge.SgeDailyResult;
import java.util.List;

public interface SgeDailyMapper {
    int insert (List<SgeDailyResult> sgedailyresultList);
}