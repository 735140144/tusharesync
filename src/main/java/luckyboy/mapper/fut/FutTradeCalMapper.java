package luckyboy.mapper.fut;
import luckyboy.result.fut.FutTradeCalResult;
import java.util.List;

public interface FutTradeCalMapper {
    int insert (List<FutTradeCalResult> futtradecalresultList);
}