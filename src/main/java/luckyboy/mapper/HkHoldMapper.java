package luckyboy.mapper;
import luckyboy.result.HkHoldResult;
import java.util.List;

public interface HkHoldMapper {
    int insert (List<HkHoldResult> hkholdresultList);
}