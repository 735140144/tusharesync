package luckyboy.mapper;

import luckyboy.result.NewShareResult;

import java.util.List;

public interface NewShareMapper {
    int insert (List<NewShareResult> newShareResultList);
}
