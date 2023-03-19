package luckyboy.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {
    public static void writeBack(String filePath,String file){
        Path path = Paths.get(filePath);
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
