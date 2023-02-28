package luckyboy.mapper;
import luckyboy.result.PledgeStatResult;
import java.util.List;

public interface PledgeStatMapper {
    int insert (List<PledgeStatResult> pledgestatresultList);
}