package luckyboy.mapper;

import luckyboy.result.GgtMonthlyResult;

import java.util.List;

public interface GgtMonthlyMapper {
    int insert (List<GgtMonthlyResult> ggtMonthlyResultList);
}
