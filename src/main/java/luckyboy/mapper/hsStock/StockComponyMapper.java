package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.StockCompanyResult;

import java.util.List;

public interface StockComponyMapper {
    int insert (List<StockCompanyResult> companyResultList);
}
