package newwe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputOutputException {
    public static void findFile() throws IOException {
        File newFile = new File("D:\\test.txt");
        FileInputStream Stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
