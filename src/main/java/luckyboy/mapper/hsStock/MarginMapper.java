package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.MarginResult;
import java.util.List;

public interface MarginMapper {
    int insert (List<MarginResult> marginresultList);
}