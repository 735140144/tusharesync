package luckyboy.mapper.stock;
import luckyboy.result.stock.StockMxResult;
import java.util.List;

public interface StockMxMapper {
    int insert (List<StockMxResult> stockmxresultList);
}