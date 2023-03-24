package luckyboy.mapper.failLog;

import luckyboy.common.FailLog;

import java.util.List;


public interface FailLogMapper {
    int insert (FailLog failLog);

    List<FailLog> needTry();

    List<FailLog> check();

    void updateIf_retryAndApi(FailLog failLog);
}
