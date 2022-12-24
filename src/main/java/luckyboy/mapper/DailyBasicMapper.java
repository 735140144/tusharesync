package luckyboy.mapper;

import luckyboy.result.DailyBasicResult;

import java.util.List;

public interface DailyBasicMapper {
    int insert (List<DailyBasicResult> dailyBasicResultList);
}
