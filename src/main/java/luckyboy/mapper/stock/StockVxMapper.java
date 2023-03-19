package luckyboy.mapper.stock;
import luckyboy.result.stock.StockVxResult;
import java.util.List;

public interface StockVxMapper {
    int insert (List<StockVxResult> stockvxresultList);
}