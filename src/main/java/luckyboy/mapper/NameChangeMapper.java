package luckyboy.mapper;

import luckyboy.result.NameChangeResult;

import java.util.List;

public interface NameChangeMapper {
    int insert (List<NameChangeResult> nameChangeResultList);
}
