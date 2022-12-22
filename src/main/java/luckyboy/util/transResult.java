package luckyboy.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Slf4j
public class transResult {
    public static <T> List<T> trans(JSONObject json,Class<T> clazz) {
        log.info("开始转换，类型为:{}",clazz);
        Integer code = json.getInteger("code");
        String msg = json.getString("msg");
        if (code!=200){
            log.error("请求错误,错误代码:{},错误信息:{}",code,msg);
        }
        JSONObject data = json.getJSONObject("data");
        JSONArray fields = data.getJSONArray("fields");
        JSONArray items = data.getJSONArray("items");
        List<T> result = new ArrayList<>();
        for (Object item : items) {
            JSONArray array = JSONArray.parseArray(item.toString());
            JSONObject jsonObject = new JSONObject();
            for (int i = 0; i < fields.size(); i++) {
                jsonObject.put(fields.getString(i),array.getString(i));
            }
            T t = jsonObject.toJavaObject(clazz);
            result.add(t);
        }
        return result;
    }
}
