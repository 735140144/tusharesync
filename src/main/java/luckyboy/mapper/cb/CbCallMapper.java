package luckyboy.mapper.cb;
import luckyboy.result.cb.CbCallResult;
import java.util.List;

public interface CbCallMapper {
    int insert (List<CbCallResult> cbcallresultList);
}