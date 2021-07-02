package day17;

import java.io.*;
import java.sql.Time;

public class work1 {
    public static void main(String[] args) throws IOException {
        //要求利用字节流去复制文本文件  图片文件  视频文件 (2种方式 单字节  多字节) 体会一下效率上的差别
        //首先创建两个文件对象
        File originalFile = new File("map.jpg");
        File copyFile = new File("copy_map1.jpg");
        //然后创建两个字节流
        FileOutputStream outputStream = new FileOutputStream(copyFile);
        FileInputStream InputStream = new FileInputStream(originalFile);
        //将输入流的内容放到输出流
        //方式一单字节进行
//        int readdata;
//        System.out.println(System.currentTimeMillis());
//        while((readdata = InputStream.read()) != -1){
//            outputStream.write(readdata);
//        }
//        System.out.println(System.currentTimeMillis());
        //方式二多字节进行
        byte[] bytes = new byte[2048];
        long start = System.currentTimeMillis();
        int readcount;
        while ((readcount = InputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, readcount);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共花了" + (end - start));
        //关闭两个流
        outputStream.close();
        InputStream.close();
    }
}
