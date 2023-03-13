package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.StkFactorResult;
import java.util.List;

public interface StkFactorMapper {
    int insert (List<StkFactorResult> stkfactorresultList);
}