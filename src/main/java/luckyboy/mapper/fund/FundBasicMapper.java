package luckyboy.mapper.fund;
import luckyboy.result.fund.FundBasicResult;
import java.util.List;

public interface FundBasicMapper {
    int insert (List<FundBasicResult> fundbasicresultList);

    List<FundBasicResult> allbasic();
}