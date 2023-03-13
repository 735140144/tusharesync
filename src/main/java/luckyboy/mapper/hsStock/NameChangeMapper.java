package luckyboy.mapper.hsStock;

import luckyboy.result.hsStock.NameChangeResult;

import java.util.List;

public interface NameChangeMapper {
    int insert (List<NameChangeResult> nameChangeResultList);
}
