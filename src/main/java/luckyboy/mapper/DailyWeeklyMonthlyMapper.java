package luckyboy.mapper;

import luckyboy.result.DailyResult;
import luckyboy.result.MonthlyResult;
import luckyboy.result.WeeklyResult;

import java.util.List;

public interface DailyWeeklyMonthlyMapper {
    int insertDaily (List<DailyResult> dailyResultList);

    int insertWeekly(List<WeeklyResult> weeklyResultList);

    int insertMonthly(List<MonthlyResult> monthlyResultList);
}
