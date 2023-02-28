package luckyboy.mapper;
import luckyboy.result.FinaAuditResult;
import java.util.List;

public interface FinaAuditMapper {
    int insert (List<FinaAuditResult> finaauditresultList);
}