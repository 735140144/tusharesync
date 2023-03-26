package luckyboy.mapper.hsStock;


import luckyboy.result.hsStock.StockBasicResult;

import java.util.List;

public interface StockBasicMapper {

    int insert(List<StockBasicResult> stockBasicResultList);

    List<StockBasicResult> getAll();
}
