package luckyboy.mapper;

import luckyboy.result.GgtDailyResult;

import java.util.List;

public interface GgtDailyMapper {
    int insert (List<GgtDailyResult> ggtDailyResultList);
}
