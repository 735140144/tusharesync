package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.NewShareResult;

import java.util.List;

public interface NewShareMapper {
    int insert (List<NewShareResult> newShareResultList);
}
