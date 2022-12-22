package luckyboy.mapper;

import luckyboy.result.HsConstResult;

import java.util.List;

public interface HsConstMapper {
    int h_insert (List<HsConstResult> hsConstResultList);

    int s_insert (List<HsConstResult> hsConstResultList);
}
