package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.GgtMonthlyResult;

import java.util.List;

public interface GgtMonthlyMapper {
    int insert (List<GgtMonthlyResult> ggtMonthlyResultList);
}
