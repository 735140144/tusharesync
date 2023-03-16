package luckyboy.mapper.fund;
import luckyboy.result.fund.FundAdjResult;
import java.util.List;

public interface FundAdjMapper {
    int insert (List<FundAdjResult> fundadjresultList);
}