package luckyboy.mapper.cb;
import luckyboy.result.cb.CbShareResult;
import java.util.List;

public interface CbShareMapper {
    int insert (List<CbShareResult> cbshareresultList);
}