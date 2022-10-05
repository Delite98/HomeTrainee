import org.testng.annotations.Test;

import java.io.*;

public class ReadFile {
    @Test
    public void createFile() throws IOException {
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