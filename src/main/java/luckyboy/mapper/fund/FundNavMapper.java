package luckyboy.mapper.fund;
import luckyboy.result.fund.FundNavResult;
import java.util.List;

public interface FundNavMapper {
    int insert (List<FundNavResult> fundnavresultList);
}