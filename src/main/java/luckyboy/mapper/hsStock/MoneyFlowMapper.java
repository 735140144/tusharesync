package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.MoneyFlowResult;

import java.util.List;

public interface MoneyFlowMapper {
    int insert (List<MoneyFlowResult> moneyFlowResultsList);
}
