package luckyboy.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DataFormat {
    public static String DateTimeFormat(Long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(time);
    }
    public static Long toTs(String YmDHms){
        DateTimeFormatter formator = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(YmDHms, formator);
        return localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }
    public static String DTFormat(Long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(time);
    }
    public static String MonFormat(Long time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
        return simpleDateFormat.format(time);
    }

    public static String NowDay(){
        return DataFormat.DTFormat(System.currentTimeMillis());
    }

    public static String YesterDay(){
        return DataFormat.DTFormat(System.currentTimeMillis()-86400000);
    }

    public static String NowMonth(){
        return DataFormat.MonFormat(System.currentTimeMillis());
    }
    public static String Report(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        String format = simpleDateFormat.format(System.currentTimeMillis());
        Integer month = Integer.valueOf(format);
        if (month<4){
            return Integer.parseInt(year.format(System.currentTimeMillis())) - 1 + "1231";
        }else if (month<5){
            return year.format(System.currentTimeMillis()) + "0331";
        }else if (month <9){
            return year.format(System.currentTimeMillis()) + "0630";
        }else {
            return year.format(System.currentTimeMillis()) + "0930";
        }
    }

    public static String NextReport(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        String format = simpleDateFormat.format(System.currentTimeMillis());
        Integer month = Integer.valueOf(format);
        if (month<=3){
            return year+"0331";
        }else if (month<=6){
            return year+"0630";
        }else if (month<=9){
            return year+"0930";
        }else {
            return year+"1231";
        }
    }
}
