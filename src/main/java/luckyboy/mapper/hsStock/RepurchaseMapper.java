package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.RepurchaseResult;
import java.util.List;

public interface RepurchaseMapper {
    int insert (List<RepurchaseResult> repurchaseresultList);
}