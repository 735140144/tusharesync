package luckyboy;

import com.baomidou.mybatisplus.core.toolkit.ClassUtils;
import lombok.extern.slf4j.Slf4j;
import luckyboy.util.*;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

@Slf4j
public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class classobj2 = Class.forName("luckyboy.result.cb.BondBlkResult");
        System.out.println(classobj2.getSimpleName());
    }

    private Result<?> dothis(){
        String apiName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return Result.ok(apiName);
    }

    private List<String> getFileNames(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        List<String> fileNames = new ArrayList<>();
        return getFileNames(file, fileNames);
    }

    private List<String> getFileNames(File file, List<String> fileNames) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getFileNames(f, fileNames);
            } else {
                fileNames.add(f.getName());
            }
        }
        return fileNames;
    }


    public static Class[] getClassByPackage(String packageName) {
        try {
            Enumeration<URL> resources = ClassUtils.class.getClassLoader().getResources(packageName.replaceAll("\\.", "/"));
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                String[] file = new File(url.getFile()).list();
                Class[] classList = new Class[file.length];
                for (int i = 0; i < file.length; i++) {
                    classList[i] = Class.forName(packageName + "." + file[i].replaceAll("\\.class", ""));
                }
                return classList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
