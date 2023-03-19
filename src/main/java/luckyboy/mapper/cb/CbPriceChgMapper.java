package luckyboy.mapper.cb;
import luckyboy.result.cb.CbPriceChgResult;
import java.util.List;

public interface CbPriceChgMapper {
    int insert (List<CbPriceChgResult> cbpricechgresultList);
}