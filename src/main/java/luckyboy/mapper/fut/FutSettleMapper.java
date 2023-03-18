package luckyboy.mapper.fut;
import luckyboy.result.fut.FutSettleResult;
import java.util.List;

public interface FutSettleMapper {
    int insert (List<FutSettleResult> futsettleresultList);
}