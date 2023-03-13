package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.ReportRcResult;
import java.util.List;

public interface ReportRcMapper {
    int insert (List<ReportRcResult> reportrcresultList);
}