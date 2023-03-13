package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.BlockTradeResult;
import java.util.List;

public interface BlockTradeMapper {
    int insert (List<BlockTradeResult> blocktraderesultList);
}