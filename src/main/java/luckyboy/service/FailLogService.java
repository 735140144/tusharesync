package luckyboy.service;

import luckyboy.common.FailLog;

import java.util.List;

public interface FailLogService {
    void Retry();

    List<FailLog> failJob();
}
