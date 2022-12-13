package luckyboy.util;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Formart {
    public JSONObject toJSONObject(){
        JSONObject result = new JSONObject();
        Field[] declaredFields = super.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            String fieldName = declaredField.getName();
            String methodName =  "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            try {
                Method method = super.getClass().getMethod(methodName);
                Object invoke = method.invoke(this);
                if(invoke != null) {
                    String fieldValue = invoke.toString();
                    result.put(fieldName, fieldValue);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public String getFields(){
        Field[] declaredFields = super.getClass().getDeclaredFields();
        return Arrays.stream(declaredFields).map(Field::getName).collect(Collectors.joining(","));
    }
}
