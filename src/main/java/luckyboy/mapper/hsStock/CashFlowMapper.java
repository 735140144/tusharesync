package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.CashFlowResult;
import java.util.List;

public interface CashFlowMapper {
    int insert (List<CashFlowResult> cashflowresultList);
}