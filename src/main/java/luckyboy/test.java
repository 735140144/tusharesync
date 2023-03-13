package luckyboy;

import luckyboy.util.*;

public class test {
    public static void main(String[] args) {
        test test = new test();
        Result<?> dothis = test.dothis();
        System.out.println(dothis);
    }

    private Result<?> dothis(){
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return Result.ok(apiName);
    }
}
