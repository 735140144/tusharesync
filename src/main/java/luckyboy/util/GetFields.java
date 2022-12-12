package luckyboy.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class GetFields {
    public static String getFields(Object model) throws NoSuchMethodError, IllegalArgumentException{
        Field[] declaredFields = model.getClass().getDeclaredFields();
        return Arrays.stream(declaredFields).map(Field::getName).collect(Collectors.joining(","));
    }
}
