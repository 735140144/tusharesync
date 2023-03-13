package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.LimitListDResult;
import java.util.List;

public interface LimitListDMapper {
    int insert (List<LimitListDResult> limitlistdresultList);
}