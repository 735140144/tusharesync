package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.PledgeDetailResult;
import java.util.List;

public interface PledgeDetailMapper {
    int insert (List<PledgeDetailResult> pledgedetailresultList);
}