package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.StkHoldertradeResult;
import java.util.List;

public interface StkHoldertradeMapper {
    int insert (List<StkHoldertradeResult> stkholdertraderesultList);
}