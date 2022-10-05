import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadFile {
    @Test
    public static void main() throws IOException {
        File createFile = new File("newFile.txt");
        createFile.createNewFile();
        PrintWriter printText = new PrintWriter(createFile);
        printText.print("Hi, I am working with new file");
        printText.close();
        String path = createFile.getAbsolutePath();
        System.out.println(path);
        createFile.delete();
    }
}
