package luckyboy.mapper;

import luckyboy.result.StkRewardsResult;

import java.util.List;

public interface StkRewardsMapper {
    int insert (List<StkRewardsResult> stkRewardsResultList);
}
