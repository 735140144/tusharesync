package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.BalanceSheetResult;
import java.util.List;

public interface BalanceSheetMapper {
    int insert (List<BalanceSheetResult> balancesheetresultList);
}