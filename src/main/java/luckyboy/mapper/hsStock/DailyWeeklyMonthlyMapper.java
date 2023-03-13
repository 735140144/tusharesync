package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.DailyResult;
import luckyboy.result.hsStock.MonthlyResult;
import luckyboy.result.hsStock.WeeklyResult;

import java.util.List;

public interface DailyWeeklyMonthlyMapper {
    int insertDaily (List<DailyResult> dailyResultList);

    int insertWeekly(List<WeeklyResult> weeklyResultList);

    int insertMonthly(List<MonthlyResult> monthlyResultList);
}
