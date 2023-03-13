package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.ExpressResult;
import java.util.List;

public interface ExpressMapper {
    int insert (List<ExpressResult> expressresultList);
}