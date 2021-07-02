package day16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名");
        //获取文件名
        String filename = sc.next();
        //在当前文件夹下创建文件
        File file = new File(filename);
        file.createNewFile();
        //获取文件内容
        System.out.println("请输入文件内容,以换行的\"stop\"停止:");
        FileOutputStream outputStream0 = new FileOutputStream(file);
        //向文件输出流中写入文件内容
        while (true) {
            String content = sc.next();
            if (! content.equals("stop")) {
                outputStream0.write(content.getBytes());
                outputStream0.write("\r\n".getBytes());
            }else{
                break;
            }

        }
        outputStream0.close();
    }
}
