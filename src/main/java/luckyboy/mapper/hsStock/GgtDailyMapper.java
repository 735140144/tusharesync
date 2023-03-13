package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.GgtDailyResult;

import java.util.List;

public interface GgtDailyMapper {
    int insert (List<GgtDailyResult> ggtDailyResultList);
}
