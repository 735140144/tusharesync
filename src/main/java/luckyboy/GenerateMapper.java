package luckyboy;


import luckyboy.mapper.*;
import luckyboy.result.*;


import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;


public class GenerateMapper {
    public static void main(String[] args) {
        //mapper
        Class<?> aClass = GgtMonthlyMapper.class;
        //result
        Class<?> resultClass = GgtMonthlyResult.class;
        //tablename
        String TABLE_NAME = "GGT_MONTHLY";

        String MAPPER_CLASS_NAME =aClass.getName();
        String simpleName = aClass.getSimpleName();
        Field[] declaredFields = resultClass.getDeclaredFields();
        String fields = Arrays.stream(declaredFields).map(Field::getName).collect(Collectors.joining(","));
        String Result = resultClass.getSimpleName();

        StringBuffer stringBuffer = new StringBuffer();
        String header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!DOCTYPE mapper\n" +
                "        PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\"\n" +
                "        \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n" +
                "<mapper namespace=\"MAPPER_CLASS_NAME\">\n" +
                "<insert id=\"insert\" parameterType=\"java.util.List\">\n" +
                "insert into TABLE_NAME\n" +
                "        (columns)\n" +
                "        values\n" +
                "        <foreach collection=\"list\" item=\"Result\" separator=\",\">\n" +
                "           (";

        stringBuffer.append(header.replace("MAPPER_CLASS_NAME",MAPPER_CLASS_NAME)
                .replace("TABLE_NAME",TABLE_NAME)
                .replace("columns",fields)
                .replace("Result",Result));
        String col = "#{Result.col,jdbcType=VARCHAR}";
        for (Field declaredField : declaredFields) {
            stringBuffer.append(col.replace("Result",Result).replace("col", declaredField.getName())).append(",\n");
        }
        stringBuffer.delete(stringBuffer.length()-2,stringBuffer.length());
        String end = ")\n" +
                "        </foreach>\n" +
                "    </insert>\n" +
                "</mapper>";
        stringBuffer.append(end);
        System.out.println(stringBuffer);

        String fileName = "D:\\helicarrier.lucky.cc\\share.luckyboy.cc\\src\\main\\resources\\mapper\\"+simpleName + ".xml";
        Path path = Paths.get(fileName);
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
