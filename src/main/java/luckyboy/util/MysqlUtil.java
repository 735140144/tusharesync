package luckyboy.util;

import com.alibaba.fastjson.JSONObject;

import java.sql.*;
import java.util.List;

public class MysqlUtil {
    public static void createTable(String sql) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://172.16.0.101:19030/ashare","root","Ssymhp12#$");
        Statement statement = connection.createStatement();
        statement.execute(sql);
        statement.close();
        connection.close();
    }
}
