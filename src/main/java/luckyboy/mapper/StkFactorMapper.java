package luckyboy.mapper;
import luckyboy.result.StkFactorResult;
import java.util.List;

public interface StkFactorMapper {
    int insert (List<StkFactorResult> stkfactorresultList);
}