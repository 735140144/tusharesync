package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.StkManagersResult;

import java.util.List;

public interface StkManagersMapper {
    int insert (List<StkManagersResult> stkManagersResultList);
}
