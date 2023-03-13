package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.StkRewardsResult;

import java.util.List;

public interface StkRewardsMapper {
    int insert (List<StkRewardsResult> stkRewardsResultList);
}
