package luckyboy.mapper;
import luckyboy.result.BrokerRecommendResult;
import java.util.List;

public interface BrokerRecommendMapper {
    int insert (List<BrokerRecommendResult> brokerrecommendresultList);
}