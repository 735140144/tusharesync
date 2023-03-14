package luckyboy.mapper.index;
import luckyboy.result.index.ThsMemberResult;
import java.util.List;

public interface ThsMemberMapper {
    int insert (List<ThsMemberResult> thsmemberresultList);
}