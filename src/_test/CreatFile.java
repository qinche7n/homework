package _test;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sacrific7e/Desktop/new.txt");
        file.createNewFile();

    }
}
