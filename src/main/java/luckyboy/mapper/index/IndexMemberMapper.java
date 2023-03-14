package luckyboy.mapper.index;
import luckyboy.result.index.IndexMemberResult;
import java.util.List;

public interface IndexMemberMapper {
    int insert (List<IndexMemberResult> indexmemberresultList);
}