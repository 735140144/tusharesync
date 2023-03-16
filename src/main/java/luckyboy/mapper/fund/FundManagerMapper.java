package luckyboy.mapper.fund;
import luckyboy.result.fund.FundManagerResult;
import java.util.List;

public interface FundManagerMapper {
    int insert (List<FundManagerResult> fundmanagerresultList);
}