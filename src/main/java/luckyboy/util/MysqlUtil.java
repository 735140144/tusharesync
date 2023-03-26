package luckyboy.util;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.sql.*;
import java.util.List;

public class MysqlUtil {
    @Value("${spring.datasource.driver-class-name}")
    private static String driverClassName;
    @Value("${spring.datasource.url}")
    private static String url;
    @Value("${spring.datasource.username}")
    private static String username;
    @Value("${spring.datasource.password}")
    private static String password;
    public static void createTable(String sql) throws Exception {
        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        statement.execute(sql);
        statement.close();
        connection.close();
    }
}
