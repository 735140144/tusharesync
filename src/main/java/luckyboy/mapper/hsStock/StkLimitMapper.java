package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.StkLimitResult;

import java.util.List;

public interface StkLimitMapper {
    int insert (List<StkLimitResult>stkLimitResultList);
}
