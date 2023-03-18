package luckyboy.mapper.sge;
import luckyboy.result.sge.SgeBasicResult;
import java.util.List;

public interface SgeBasicMapper {
    int insert (List<SgeBasicResult> sgebasicresultList);
}