package luckyboy.mapper.hsStock;
import luckyboy.result.hsStock.BrokerRecommendResult;
import java.util.List;

public interface BrokerRecommendMapper {
    int insert (List<BrokerRecommendResult> brokerrecommendresultList);
}