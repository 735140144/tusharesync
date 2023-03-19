package luckyboy.mapper.tmt;
import luckyboy.result.tmt.BoMonthlyResult;
import java.util.List;

public interface BoMonthlyMapper {
    int insert (List<BoMonthlyResult> bomonthlyresultList);
}