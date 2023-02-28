package luckyboy.mapper;
import luckyboy.result.CashFlowResult;
import java.util.List;

public interface CashFlowMapper {
    int insert (List<CashFlowResult> cashflowresultList);
}