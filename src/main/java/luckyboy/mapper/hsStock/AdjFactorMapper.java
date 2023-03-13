package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.AdjFactorResult;

import java.util.List;

public interface AdjFactorMapper {
    int insert (List<AdjFactorResult> adjFactorResultList);
}
