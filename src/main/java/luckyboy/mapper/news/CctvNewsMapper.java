package luckyboy.mapper.news;
import luckyboy.result.news.CctvNewsResult;
import java.util.List;

public interface CctvNewsMapper {
    int insert (List<CctvNewsResult> cctvnewsresultList);
}