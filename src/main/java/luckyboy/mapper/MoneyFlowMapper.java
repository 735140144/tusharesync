package luckyboy.mapper;

import luckyboy.result.MoneyFlowResult;

import java.util.List;

public interface MoneyFlowMapper {
    int insert (List<MoneyFlowResult> moneyFlowResultsList);
}
