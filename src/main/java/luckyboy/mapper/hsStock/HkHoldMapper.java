package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.HkHoldResult;
import java.util.List;

public interface HkHoldMapper {
    int insert (List<HkHoldResult> hkholdresultList);
}