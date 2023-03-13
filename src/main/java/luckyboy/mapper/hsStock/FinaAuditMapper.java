package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.FinaAuditResult;
import java.util.List;

public interface FinaAuditMapper {
    int insert (List<FinaAuditResult> finaauditresultList);
}