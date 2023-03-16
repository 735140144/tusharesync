package luckyboy.mapper.fund;
import luckyboy.result.fund.FundShareResult;
import java.util.List;

public interface FundShareMapper {
    int insert (List<FundShareResult> fundshareresultList);
}