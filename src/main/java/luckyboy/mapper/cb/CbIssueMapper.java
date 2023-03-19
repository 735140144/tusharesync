package luckyboy.mapper.cb;
import luckyboy.result.cb.CbIssueResult;
import java.util.List;

public interface CbIssueMapper {
    int insert (List<CbIssueResult> cbissueresultList);
}