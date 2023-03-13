package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.MarginTargetResult;
import java.util.List;

public interface MarginTargetMapper {
    int insert (List<MarginTargetResult> margintargetresultList);
}