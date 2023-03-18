package luckyboy;


import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import com.google.common.base.CaseFormat;
import luckyboy.result.fund.*;
import luckyboy.result.fut.*;
import luckyboy.result.hsStock.BrokerRecommendResult;
import luckyboy.result.index.*;
import luckyboy.result.opt.OptBasicResult;
import luckyboy.result.opt.OptDailyResult;
import luckyboy.result.sge.SgeBasicResult;
import luckyboy.result.sge.SgeDailyResult;


public class GenerateMapper {
    public static void main(String[] args) throws Exception {
        Class<?> resultClass = OptDailyResult.class;
        GenerateSql.doSql(resultClass);
        generateMapper(resultClass,"opt");

    }

    public static void generateMapper(Class<?> clasName,String pkgName){
        //result
        Class<?> resultClass = clasName;
        //tablename
        String TABLE_NAME = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, resultClass.getSimpleName().replace("Result",""));

        String mapperName = resultClass.getSimpleName().replace("Result", "Mapper");
        String mapperHead = "package luckyboy.mapper."+pkgName+";\n"+
                "import luckyboy.result."+pkgName+"."+resultClass.getSimpleName()+";\n"+
                "import java.util.List;\n\n"+
                "public interface "+mapperName+" {\n" +
                "    int insert (List<"+resultClass.getSimpleName()+"> "+CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,resultClass.getSimpleName())+"List);\n" +
                "}";
        String mapperFileName = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/mapper/"+pkgName+"/"+mapperName + ".java";
        Path mapperPath = Paths.get(mapperFileName);
        try (BufferedWriter writer =
                     Files.newBufferedWriter(mapperPath, StandardCharsets.UTF_8)) {
            writer.write(mapperHead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String MAPPER_CLASS_NAME ="luckyboy.mapper."+pkgName+"."+mapperName;
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

        String fileName = "/Users/mtlroyal/opt/tusharesynchronous/src/main/resources/mapper/"+ mapperName + ".xml";
        Path path = Paths.get(fileName);
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
