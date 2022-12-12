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
}
