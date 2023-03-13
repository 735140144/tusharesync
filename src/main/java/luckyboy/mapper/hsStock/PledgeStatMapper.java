package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.PledgeStatResult;
import java.util.List;

public interface PledgeStatMapper {
    int insert (List<PledgeStatResult> pledgestatresultList);
}