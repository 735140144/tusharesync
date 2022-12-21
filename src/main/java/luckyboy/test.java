package luckyboy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import luckyboy.common.TranResult;
import luckyboy.common.TusharePostParam;
import luckyboy.params.StockBasicParams;
import luckyboy.result.StockBasicResult;
import luckyboy.util.GetFields;
import luckyboy.util.ParamsToJson;
import luckyboy.util.TusharePost;
import luckyboy.util.transResult;
import org.apache.commons.lang3.StringUtils;

public class test {
    public static void main(String[] args) {
        StockBasicParams basicParams = StockBasicParams.builder().build();
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stock_basic").params(basicParams.toJSONObject()).fields(new StockBasicResult().getFields()).build();
        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);
        TranResult trans = transResult.trans(jsonObject);

    }
}
