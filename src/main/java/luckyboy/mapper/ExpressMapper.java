package luckyboy.mapper;
import luckyboy.result.ExpressResult;
import java.util.List;

public interface ExpressMapper {
    int insert (List<ExpressResult> expressresultList);
}