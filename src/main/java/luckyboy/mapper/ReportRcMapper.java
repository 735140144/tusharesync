package luckyboy.mapper;
import luckyboy.result.ReportRcResult;
import java.util.List;

public interface ReportRcMapper {
    int insert (List<ReportRcResult> reportrcresultList);
}