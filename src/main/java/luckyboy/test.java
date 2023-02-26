package luckyboy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import luckyboy.common.TranResult;
import luckyboy.common.TusharePostParam;
import luckyboy.params.StockBasicParams;
import luckyboy.result.StockBasicResult;
import luckyboy.util.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class test {
    public static void main(String[] args) {
        test test = new test();
        Result<?> dothis = test.dothis();
        System.out.println(dothis);
    }

    private Result<?> dothis(){
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return Result.ok(apiName);
    }
}
