package luckyboy.util;

import luckyboy.common.ExplainAnnotation;
import luckyboy.result.InComeResult;

import java.lang.reflect.Field;

/**
 * @Author: Putin
 * @CreateTime: 2023-02-27  20:44
 */
public class GenerateSql {
    public static void main(String[] args) {
        Field[] declaredFields = InComeResult.class.getDeclaredFields();
        String Dbname = "11";
        String TableName = "22";
        StringBuffer create = new StringBuffer();
        create.append("create table ");
        create.append(Dbname);
        create.append(".");
        create.append(TableName);
        create.append(" (\n");
        for (int i = 0; i < declaredFields.length; i++) {
            //获取字段
            Field field = declaredFields[i];
            //设置私有熟悉可访问
            field.setAccessible(true);
            create.append(field.getName()).append(" varchar(255) ");
            //获取字段上注解
            ExplainAnnotation annotation = field.getAnnotation(ExplainAnnotation.class);
            if (annotation != null) {
                String comment = annotation.comment();
                create.append("comment \"").append(comment).append("\"");
            }
            create.append(" ,\n");
        }
        create.delete(create.length()-2,create.length());
        create.append("\n) ")
                .append("UNIQUE KEY(      )\n")
                .append("DISTRIBUTED BY HASH(    ) BUCKETS 10\n")
                .append("PROPERTIES (\n" +
                        "  \"replication_num\" = \"3\"\n" +
                        ");");
        System.out.println(create.toString());

    }
}
