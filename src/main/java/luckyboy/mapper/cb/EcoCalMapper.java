package luckyboy.mapper.cb;
import luckyboy.result.cb.EcoCalResult;
import java.util.List;

public interface EcoCalMapper {
    int insert (List<EcoCalResult> ecocalresultList);
}