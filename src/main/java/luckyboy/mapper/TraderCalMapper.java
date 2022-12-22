package luckyboy.mapper;

import luckyboy.result.TraderCalResult;

import java.util.List;

public interface TraderCalMapper {
    int insert(List<TraderCalResult> traderCalResultList);
}
