package luckyboy.mapper.fut;
import luckyboy.result.fut.FutWsrResult;
import java.util.List;

public interface FutWsrMapper {
    int insert (List<FutWsrResult> futwsrresultList);
}