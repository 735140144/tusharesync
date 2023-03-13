package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.HsConstResult;

import java.util.List;

public interface HsConstMapper {
    int h_insert (List<HsConstResult> hsConstResultList);

    int s_insert (List<HsConstResult> hsConstResultList);
}
