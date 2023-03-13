package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.TraderCalResult;

import java.util.List;

public interface TraderCalMapper {
    int insert(List<TraderCalResult> traderCalResultList);
}
