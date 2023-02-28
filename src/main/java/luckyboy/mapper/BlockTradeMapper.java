package luckyboy.mapper;
import luckyboy.result.BlockTradeResult;
import java.util.List;

public interface BlockTradeMapper {
    int insert (List<BlockTradeResult> blocktraderesultList);
}