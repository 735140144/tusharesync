package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.StkSurvResult;
import java.util.List;

public interface StkSurvMapper {
    int insert (List<StkSurvResult> stksurvresultList);
}