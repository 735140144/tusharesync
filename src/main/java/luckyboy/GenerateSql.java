package luckyboy;

import com.google.common.base.CaseFormat;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.util.MysqlUtil;

import java.lang.reflect.Field;

/**
 * @Author: Putin
 * @CreateTime: 2023-02-27  20:44
 */
public class GenerateSql {
    public static void doSql(Class<?> className) throws Exception {
        Class<?> resultClass = className;
        Field[] declaredFields = resultClass.getDeclaredFields();
        String Dbname = "ashare";
        String TableName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, resultClass.getSimpleName().replace("Result",""));


        StringBuffer create = new StringBuffer();
        create.append("create table if not exists ");
        create.append(Dbname);
        create.append(".");
        create.append(TableName);
        create.append(" (\n");
        for (int i = 0; i < declaredFields.length; i++) {
            //获取字段
            Field field = declaredFields[i];
            //设置私有熟悉可访问
            field.setAccessible(true);
            //获取字段上注解
            ExplainAnnotation annotation = field.getAnnotation(ExplainAnnotation.class);
            if (annotation != null) {
                create.append("`").append(field.getName()).append("` ").append(annotation.colType());
                String comment = annotation.comment();
                create.append(" comment \"").append(comment).append("\"");
            }
            create.append(" ,\n");
        }
        create.delete(create.length()-2,create.length());
        create.append("\n) ")
                .append("UNIQUE KEY(");
        for (int i = 0; i < declaredFields.length; i++) {
            //获取字段
            Field field = declaredFields[i];
            //设置私有熟悉可访问
            field.setAccessible(true);
            //获取字段上注解
            KeyAnnotation annotation = field.getAnnotation(KeyAnnotation.class);
            if (annotation != null) {
                create.append(field.getName()).append(",");
            }
        }
        create.delete(create.length()-1,create.length());
        create.append(")\n").append("DISTRIBUTED BY HASH(");
        for (int i = 0; i < declaredFields.length; i++) {
            //获取字段
            Field field = declaredFields[i];
            //设置私有熟悉可访问
            field.setAccessible(true);
            //获取字段上注解
            BucketAnnotation annotation = field.getAnnotation(BucketAnnotation.class);
            if (annotation != null) {
                create.append(field.getName()).append(",");
            }
        }
        create.delete(create.length()-1,create.length());
        create.append(") BUCKETS 10 \n")
                .append("PROPERTIES (\n" +
                        "  \"replication_num\" = \"3\"\n" +
                        ")");
        System.out.println(create.toString());
        MysqlUtil.createTable(create.toString());
    }

}
