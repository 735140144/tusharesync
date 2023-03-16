package luckyboy.mapper.fund;
import luckyboy.result.fund.FundCompanyResult;
import java.util.List;

public interface FundCompanyMapper {
    int insert (List<FundCompanyResult> fundcompanyresultList);
}