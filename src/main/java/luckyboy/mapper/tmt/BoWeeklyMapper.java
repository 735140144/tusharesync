package luckyboy.mapper.tmt;
import luckyboy.result.tmt.BoWeeklyResult;
import java.util.List;

public interface BoWeeklyMapper {
    int insert (List<BoWeeklyResult> boweeklyresultList);
}