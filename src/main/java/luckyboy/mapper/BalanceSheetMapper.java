package luckyboy.mapper;
import luckyboy.result.BalanceSheetResult;
import java.util.List;

public interface BalanceSheetMapper {
    int insert (List<BalanceSheetResult> balancesheetresultList);
}