package luckyboy.mapper;
import luckyboy.result.RepurchaseResult;
import java.util.List;

public interface RepurchaseMapper {
    int insert (List<RepurchaseResult> repurchaseresultList);
}