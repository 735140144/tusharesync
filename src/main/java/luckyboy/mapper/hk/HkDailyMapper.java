package luckyboy.mapper.hk;
import luckyboy.result.hk.HkDailyResult;
import java.util.List;

public interface HkDailyMapper {
    int insert (List<HkDailyResult> hkdailyresultList);
}