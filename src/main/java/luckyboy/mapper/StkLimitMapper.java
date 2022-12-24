package luckyboy.mapper;

import luckyboy.result.StkLimitResult;

import java.util.List;

public interface StkLimitMapper {
    int insert (List<StkLimitResult>stkLimitResultList);
}
