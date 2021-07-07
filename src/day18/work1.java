package day18;

import java.io.*;
import java.nio.Buffer;

public class work1 {
    public static void main(String[] args) throws IOException {
        //要求:利用字符流去读取一个文本文件，每次读取一行，并将这行数据逆序，写入新的文本文件当中
        //创建文件对象
        //创建缓冲字符输入流
        //创建缓冲字符输出流
        //读取并排序并写入
        //刷新关闭
        BufferedReader in = new BufferedReader(new FileReader("severalLines.txt"));
        File file = new File("copyLines.txt");
        file.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        String content;
        while ((content = in.readLine()) != null) {
            StringBuffer stringBuffer = new StringBuffer(content);
            content = stringBuffer.reverse().toString();
            out.write(content, 0, content.length());
            out.newLine();
        }
        in.close();
        out.flush();
        out.close();


    }
}
