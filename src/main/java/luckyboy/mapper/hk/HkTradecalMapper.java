package luckyboy.mapper.hk;
import luckyboy.result.hk.HkTradecalResult;
import java.util.List;

public interface HkTradecalMapper {
    int insert (List<HkTradecalResult> hktradecalresultList);
}