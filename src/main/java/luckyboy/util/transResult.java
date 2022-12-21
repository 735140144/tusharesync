package luckyboy.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import luckyboy.common.TranResult;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class transResult {
    public static TranResult trans(JSONObject json) {
        Integer code = json.getInteger("code");
        String msg = json.getString("msg");
        JSONObject data = json.getJSONObject("data");
        JSONArray fields = data.getJSONArray("fields");
        JSONArray items = data.getJSONArray("items");
        TranResult tranResult = new TranResult();
        List<String> strings = new ArrayList<>();

        return tranResult;
    }
}
