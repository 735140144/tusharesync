package luckyboy.util;

import luckyboy.GenerateSql;
import luckyboy.common.CommonSql;

import java.util.Arrays;
import java.util.List;

import static luckyboy.GenerateMapper.generateMapper;

public class InitSqlUtil {
    public static void initDoirs(String Dbname) throws Exception {
        List<String> list = Arrays.asList("cb", "fund", "fut", "fx", "hk", "hsStock", "index", "news", "opt", "sge", "stock", "tmt", "us");
        for (String pkg : list) {
            String property = System.getProperty("user.dir");
            String url = property+"/src/main/java/luckyboy/result/" + pkg;
            GetResults getResults = new GetResults();
            List<String> fileNames = getResults.getFileNames(url);
            for (String fileName : fileNames) {
                String resultName = fileName.split("Result")[0];
                Class<?> resultClass = Class.forName("luckyboy.result." + pkg + "." + resultName + "Result");
                GenerateSql.doSql(resultClass,Dbname);
            }
        }
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.failLogDoris);
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.scheduledJobDoris);
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.scheduledCornDoris);
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.scheduledCornJobDoris);
    }

    public static void initMysql(String Dbname) throws Exception{
        List<String> list = Arrays.asList("cb", "fund", "fut", "fx", "hk", "hsStock", "index", "news", "opt", "sge", "stock", "tmt", "us");
        for (String pkg : list) {
            String property = System.getProperty("user.dir");
            String url = property+"/src/main/java/luckyboy/result/" + pkg;
            GetResults getResults = new GetResults();
            List<String> fileNames = getResults.getFileNames(url);
            for (String fileName : fileNames) {
                String resultName = fileName.split("Result")[0];
                Class<?> resultClass = Class.forName("luckyboy.result." + pkg + "." + resultName + "Result");
                GenerateSql.mysql(resultClass,Dbname);
            }
        }
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.failLogMysql);
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.scheduledJobMysql);
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.scheduledCornmysql);
        MysqlUtil.createTable("create table if not exists "+Dbname+ CommonSql.scheduledCornJobMysql);
    }
}
