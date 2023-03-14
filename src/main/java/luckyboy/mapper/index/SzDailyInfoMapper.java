package luckyboy.mapper.index;
import luckyboy.result.index.SzDailyInfoResult;
import java.util.List;

public interface SzDailyInfoMapper {
    int insert (List<SzDailyInfoResult> szdailyinforesultList);
}