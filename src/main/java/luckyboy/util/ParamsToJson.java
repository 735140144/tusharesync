package luckyboy.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
@Slf4j
public class ParamsToJson {
    public static JSONObject toJsonObject(Object o){
        Class<?> c = o.getClass();
        JSONObject begin = JSON.parseObject(o.toString());
        log.info("开始转换Params：{}",o.getClass());
        Field[] declaredFields = c.getDeclaredFields();
        JSONObject result = new JSONObject();
        for (Field declaredField : declaredFields) {
            String fieldName = declaredField.getName();
            String fieldValue = begin.getString(fieldName);
            if (!fieldValue.equals("null")){
                result.put(fieldName,fieldValue);
            }
        }
        return result;
    }
}
