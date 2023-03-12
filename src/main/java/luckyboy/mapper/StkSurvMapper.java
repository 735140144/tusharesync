package luckyboy.mapper;
import luckyboy.result.StkSurvResult;
import java.util.List;

public interface StkSurvMapper {
    int insert (List<StkSurvResult> stksurvresultList);
}