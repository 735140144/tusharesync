package luckyboy.mapper.tmt;
import luckyboy.result.tmt.TeleplayRecordResult;
import java.util.List;

public interface TeleplayRecordMapper {
    int insert (List<TeleplayRecordResult> teleplayrecordresultList);
}