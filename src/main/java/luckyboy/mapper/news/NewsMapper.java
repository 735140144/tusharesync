package luckyboy.mapper.news;
import luckyboy.result.news.NewsResult;
import java.util.List;

public interface NewsMapper {
    int insert (List<NewsResult> newsresultList);
}