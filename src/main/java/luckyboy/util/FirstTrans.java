package luckyboy.util;

/**
 * 首字母大小写
 */
public class FirstTrans {
    public static String captureName(String str) {
        // 进行字母的ascii编码前移，效率要高于截取字符串进行转换的操作
        char[] cs=str.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }
    public static String lowerFirst(String str) {
        // 同理
        char[] cs=str.toCharArray();
        cs[0]+=32;
        return String.valueOf(cs);
    }
}
