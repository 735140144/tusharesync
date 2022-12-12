package luckyboy.common;

/**
 * @author
 * @Description
 * @date 2022-06-23
 */

public class AshareConfig {

    //tableEnv
    public static final String Name = "myhive";
    public static final String defaultDatabase = "ASHARE";
    public static final String hiveConfDir = "F:\\ASHARE_demo\\ASHARE_Flink\\src\\main\\resources";
    public static final String hiveConfDirQa = "/home/module/hive/conf";
    public static final String version="3.1.2";
    //hiveJDBC
    public static final String HIVE_DRIVER = "org.apache.hive.jdbc.HiveDriver";
    public static final String HIVE_SERRVER = "jdbc:hive2://hadoop102:10000/ashare";
    //FLINKCDC
    public static final String CDCHOSTNAME = "hadoop102";
    public static final int CDCPORT = 3306;
    public static final String CDCUSER = "root";
    public static final String CDCPASSWD = "Ssymhp12#$";

    public static final String MysqlUserName="root";
    public static final String MysqlPasswd = "Ssymhp12#$";
    public static final String DriverName ="com.mysql.jdbc.Driver";
    public static final String MysqlUrl = "jdbc:mysql://sql.luckyboy.cc:3306/Test1";

    public static final String ALIDBNAME="luckyboy";
    public static final String ALIPASSWD = "Ssymhp12#$";
    public static final Integer ALIPORT = 53306;
    public static final String ALIDriveName ="com.mysql.jdbc.Driver";
    public static final String Alirul = "ali.luckyboy.cc";

    public static class TencTest{
        public static final String HOST ="121.4.114.110";

        public static final int PORT = 3306;

        public static final String USERNAME= "flink";

        public static final String PASSWD  = "Flink1025!";

        public static final String DB1 = "Test";

        public static final String DB2 = "Test1";
    }

    public static class AliLucky {
        public static final String ALIDBNAME = "flink";
        public static final String ALIPASSWD = "FlinkRead123";
        public static final int ALIPORT = 53306;
        public static final String ALIDriveName = "com.mysql.jdbc.Driver";
        public static final String Alirul = "ali.luckyboy.cc";


    }

    public static class AliTable{
        public static final String ads_lucky = "ads_lucky";
        public static final String ads_single_ma_earning = "ads_lucky.ads_single_ma_earning";
    }

    public static final String PushUrl = "https://sctapi.ftqq.com/SCT183946TmQ6u7XxA1s1cdYVC7wrMiiZo.send";
    public static final String PushDeerSelf ="http://120.48.27.119:8800/";
    public static final String PushKey = "PDU1TTHCpVywlgFcAIKObwQo0kli5cjK41rH2";

}
