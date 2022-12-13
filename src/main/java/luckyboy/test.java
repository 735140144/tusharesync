package luckyboy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import luckyboy.common.TusharePostParam;
import luckyboy.params.StockBasicParams;
import luckyboy.result.StockBasicResult;
import luckyboy.util.GetFields;
import luckyboy.util.ParamsToJson;
import luckyboy.util.TusharePost;

public class test {
    public static void main(String[] args) {
        StockBasicParams basicParams = StockBasicParams.builder().build();
        JSONObject params = ParamsToJson.toJsonObject(basicParams);
        String fields = GetFields.getFields(new StockBasicResult());
        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name("stock_basic").params(params).fields(fields).build();
        System.out.println(tusharePostParam);
        System.out.println(TusharePost.httpPostForStockList(tusharePostParam));
    }
}
