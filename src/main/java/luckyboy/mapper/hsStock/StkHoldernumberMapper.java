package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.StkHoldernumberResult;
import java.util.List;

public interface StkHoldernumberMapper {
    int insert (List<StkHoldernumberResult> stkholdernumberresultList);
}