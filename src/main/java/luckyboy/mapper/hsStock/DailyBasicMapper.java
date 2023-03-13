package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.DailyBasicResult;

import java.util.List;

public interface DailyBasicMapper {
    int insert (List<DailyBasicResult> dailyBasicResultList);
}
