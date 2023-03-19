package luckyboy.mapper.tmt;
import luckyboy.result.tmt.FilmRecordResult;
import java.util.List;

public interface FilmRecordMapper {
    int insert (List<FilmRecordResult> filmrecordresultList);
}