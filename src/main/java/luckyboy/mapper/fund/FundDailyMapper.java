package luckyboy.mapper.fund;
import luckyboy.result.fund.FundDailyResult;
import java.util.List;

public interface FundDailyMapper {
    int insert (List<FundDailyResult> funddailyresultList);
}