package luckyboy.util;

import com.google.common.base.CaseFormat;
import luckyboy.common.ResultComment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GetResults {
    public static void generateService(String pkg) throws ClassNotFoundException {
        String url = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/result/" + pkg;
        GetResults getResults = new GetResults();
        List<String> fileNames = getResults.getFileNames(url);
        String backFileName = FirstTrans.captureName(pkg) + "DataService";
        StringBuffer stringBuffer = new StringBuffer();
        String serviceHeader = "package luckyboy.service;\n" +
                "\n" +
                "import io.swagger.annotations.Api;\n" +
                "import io.swagger.annotations.ApiOperation;\n" +
                "import luckyboy.params." + pkg + ".*;\n" +
                "import luckyboy.util.Result;\n\n"+
                "@Api(value = \"\",tags = \"\")\n";

        stringBuffer.append(serviceHeader)
                .append("public interface ").append(backFileName)
                .append(" {\n");

        for (String fileName : fileNames) {
            String resultName = fileName.split("Result")[0];
            String apiName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, resultName);
            Class<?> aClass = Class.forName("luckyboy.result." + pkg + "." + resultName + "Result");
            ResultComment annotation = aClass.getAnnotation(ResultComment.class);
            stringBuffer.append("\t@ApiOperation(\"").append(annotation.comment()).append("\")\n")
                    .append("\tResult<?> ").append(apiName).append(" (").append(resultName).append("Params params").append(");\n\n\n");
        }
        stringBuffer.append("}");

        System.out.println(stringBuffer.toString());
//        回写
        String fileName = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/service/" + backFileName + ".java";
        WriteFile.writeBack(fileName,stringBuffer.toString());
    }

    public static void generateServiceImpl(String pkg) throws ClassNotFoundException {
        String url = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/result/" + pkg;
        GetResults getResults = new GetResults();
        List<String> fileNames = getResults.getFileNames(url);
        String backFileName = FirstTrans.captureName(pkg) + "DataServiceImpl";
        StringBuffer stringBuffer = new StringBuffer();
        String serviceHeader = "package luckyboy.service.Impl;\n" +
                "\n" +
                "import com.alibaba.fastjson.JSONObject;\n" +
                "import lombok.extern.slf4j.Slf4j;\n" +
                "import luckyboy.common.FailLog;\n" +
                "import luckyboy.common.TusharePostParam;\n" +
                "import luckyboy.mapper.failLog.FailLogMapper;\n" +
                "import luckyboy.mapper." + pkg + ".*;\n" +
                "import luckyboy.params." + pkg + ".*;\n" +
                "import luckyboy.result." + pkg + ".*;\n" +
                "import luckyboy.service." + FirstTrans.captureName(pkg) + "DataService;\n" +
                "import luckyboy.util.Result;\n" +
                "import luckyboy.util.TusharePost;\n" +
                "import luckyboy.util.transResult;\n" +
                "import org.springframework.stereotype.Service;\n" +
                "\n" +
                "import javax.annotation.Resource;\n" +
                "import java.util.List;\n";
        StringBuffer ImplBuffer = new StringBuffer();
        ImplBuffer.append(serviceHeader).append(stringBuffer).append("@Service\n").append("@Slf4j\n")
                .append("public class ").append(backFileName).append(" implements ").append(FirstTrans.captureName(pkg)).append("DataService {\n")
                .append("\t@Resource\n")
                .append("\tprivate FailLogMapper failLogMapper;\n");

        for (String fileName : fileNames) {
            String resultName = fileName.split("Result")[0];
            String apiName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, resultName);
            Class<?> aClass = Class.forName("luckyboy.result." + pkg + "." + resultName + "Result");
            ResultComment annotation = aClass.getAnnotation(ResultComment.class);
            ImplBuffer.append("\t@Resource\n")
                    .append("\tprivate ").append(resultName).append("Mapper ").append(FirstTrans.lowerFirst(resultName)).append("Mapper;\n");
        }

        for (String fileName : fileNames) {
            String resultName = fileName.split("Result")[0];
            String apiName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, resultName);
            Class<?> aClass = Class.forName("luckyboy.result." + pkg + "." + resultName + "Result");
            ResultComment annotation = aClass.getAnnotation(ResultComment.class);
            String detail = "    @Override\n" +
                    "    public Result<?> " + apiName + "(" + resultName + "Params params) {\n" +
                    "        log.info(\"开始拉取" + annotation.comment() + ",时间戳：{}\", System.currentTimeMillis());\n" +
                    "        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();\n" +
                    "        TusharePostParam tusharePostParam = TusharePostParam.builder().api_name(apiName).params(params.toJSONObject()).fields(new " + resultName + "Result().getFields()).build();\n" +
                    "        JSONObject jsonObject = TusharePost.httpPostForStockList(tusharePostParam);\n" +
                    "        List<" + resultName + "Result> trans = transResult.trans(jsonObject, " + resultName + "Result.class);\n" +
                    "        if (trans.size() > 0) {\n" +
                    "            log.info(\"开始写入数据库，时间戳：{}\", System.currentTimeMillis());\n" +
                    "            " + FirstTrans.lowerFirst(resultName) + "Mapper.insert(trans);\n" +
                    "        } else {\n" +
                    "            log.info(\"未获取到数据！\");\n" +
                    "            failLogMapper.insert(FailLog.builder().api(apiName).comment(\"" + annotation.comment() + "\").build());\n" +
                    "        }\n" +
                    "        return Result.ok(jsonObject.getString(\"msg\"));\n" +
                    "    }\n\n";

            ImplBuffer.append(detail);
        }
        ImplBuffer.append("}");
        System.out.println(ImplBuffer);
        String fileName = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/service/Impl/" + backFileName + ".java";
        WriteFile.writeBack(fileName,ImplBuffer.toString());
    }

    public static void generateApi(String pkg) throws ClassNotFoundException {
        String url = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/result/" + pkg;
        GetResults getResults = new GetResults();
        List<String> fileNames = getResults.getFileNames(url);
        String backFileName = FirstTrans.captureName(pkg) + "DataApi";
        String ApiHeader = "package luckyboy.api;\n" +
                "\n" +
                "import io.swagger.annotations.Api;\n" +
                "import io.swagger.annotations.ApiOperation;\n" +
                "import luckyboy.util.Result;\n" +
                "import org.apache.ibatis.annotations.Param;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.RequestMethod;\n" +
                "import org.springframework.web.bind.annotation.RestController;\n" +
                "\n" +
                "@Api(value = \"\",tags = \"\")\n" +
                "@RestController\n" +
                "@RequestMapping(value = \"/data/" + pkg + "\",method = RequestMethod.GET)\n" +
                "public interface " + backFileName + " {\n\n";

        StringBuffer buffer = new StringBuffer();
        buffer.append(ApiHeader);
        for (String fileName : fileNames) {
            String resultName = fileName.split("Result")[0];
            String apiName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, resultName);
            Class<?> aClass = Class.forName("luckyboy.result." + pkg + "." + resultName + "Result");
            ResultComment annotation = aClass.getAnnotation(ResultComment.class);
            String detail = "    @ApiOperation(\"" + annotation.comment() + "\")\n" +
                    "    @RequestMapping(\"/" + apiName + "\")\n" +
                    "    Result<?> " + apiName + "(";
            buffer.append(detail);
            Class<?> aClass1 = Class.forName("luckyboy.params." + pkg + "." + resultName + "Params");
            Field[] declaredFields = aClass1.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                buffer.append("@Param(\"").append(field.getName()).append("\") ").append("String ").append(field.getName());
                if (i != declaredFields.length - 1) {
                    buffer.append(",");
                }
            }
            buffer.append(");\n\n");
        }
        buffer.append("}");
        System.out.println(buffer.toString());
        String fileName = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/api/" + backFileName + ".java";
        WriteFile.writeBack(fileName,buffer.toString());
    }

    public static void generateApiServvice(String pkg) throws ClassNotFoundException {
        String url = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/result/" + pkg;
        GetResults getResults = new GetResults();
        List<String> fileNames = getResults.getFileNames(url);
        String backFileName = FirstTrans.captureName(pkg) + "DataApiImpl";
        String apiSerHeader = "package luckyboy.service.Impl;\n" +
                "\n" +
                "import lombok.extern.slf4j.Slf4j;\n" +
                "import luckyboy.api." + FirstTrans.captureName(pkg) + "DataApi;\n" +
                "import luckyboy.params." + pkg + ".*;\n" +
                "import luckyboy.service." + FirstTrans.captureName(pkg) + "DataService;\n" +
                "import luckyboy.util.Result;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "\n" +
                "@Slf4j\n" +
                "public class " + FirstTrans.captureName(pkg) + "DataApiImpl implements " + FirstTrans.captureName(pkg) + "DataApi {\n" +
                "    @Autowired\n" +
                "    private "+FirstTrans.captureName(pkg)+"DataService "+pkg+"DataService;\n\n";
        StringBuffer buffer = new StringBuffer();
        buffer.append(apiSerHeader);
        for (String fileName : fileNames) {
            String resultName = fileName.split("Result")[0];
            String apiName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, resultName);
            String detail = "    @Override\n" +
                    "    public Result<?> "+apiName+"(";
            buffer.append(detail);
            Class<?> aClass1 = Class.forName("luckyboy.params." + pkg + "." + resultName + "Params");
            Field[] declaredFields = aClass1.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                buffer.append("String ").append(field.getName());
                if (i != declaredFields.length - 1) {
                    buffer.append(",");
                }
            }
            buffer.append(") {\n");
            buffer.append("        ").append(resultName).append("Params").append(" build = ")
                    .append(resultName).append("Params.builder()");
            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                buffer.append(".").append(field.getName()).append("(").append(field.getName()).append(")");
            }
            buffer.append(".build();\n")
                    .append("        return ").append(pkg).append("DataService.").append(apiName).append("(build);\n")
                    .append("    }\n\n");
        }
        buffer.append("}");
        System.out.println(buffer.toString());
        String fileName = "/Users/mtlroyal/opt/tusharesynchronous/src/main/java/luckyboy/service/Impl/" + backFileName + ".java";
        WriteFile.writeBack(fileName,buffer.toString());
    }


    public List<String> getFileNames(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        List<String> fileNames = new ArrayList<>();
        return getFileNames(file, fileNames);
    }

    private List<String> getFileNames(File file, List<String> fileNames) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getFileNames(f, fileNames);
            } else {
                fileNames.add(f.getName());
            }
        }
        return fileNames;
    }
}
