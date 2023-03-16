package luckyboy.mapper.fund;
import luckyboy.result.fund.FundPortfolioResult;
import java.util.List;

public interface FundPortfolioMapper {
    int insert (List<FundPortfolioResult> fundportfolioresultList);
}