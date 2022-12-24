package luckyboy;

import luckyboy.mapper.AdjFactorMapper;
import luckyboy.mapper.StockComponyMapper;
import luckyboy.result.AdjFactorResult;
import luckyboy.result.SuspendDResult;

import java.lang.reflect.Field;

public class GenerateMapper {
    public static void main(String[] args) {
        String MAPPER_CLASS_NAME =StockComponyMapper.class.getName();
        String TABLE_NAME = "";
        String fields = new AdjFactorResult().getFields();
        Field[] declaredFields = AdjFactorResult.class.getDeclaredFields();
        String Result = AdjFactorResult.class.getSimpleName();

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
    }
}
