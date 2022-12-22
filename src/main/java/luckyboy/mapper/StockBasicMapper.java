package luckyboy.mapper;


import luckyboy.result.StockBasicResult;

import java.util.List;

public interface StockBasicMapper {

    int insert(List<StockBasicResult> stockBasicResultList);
}
