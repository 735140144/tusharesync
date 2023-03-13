package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.MarginDetailResult;
import java.util.List;

public interface MarginDetailMapper {
    int insert (List<MarginDetailResult> margindetailresultList);
}