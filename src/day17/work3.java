package day17;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class work3 {
    public static void main(String[] args) throws IOException {
        //要求:在一个磁盘的文件里保存26个英文小写字母（乱序），
        // 将他们读入内存中，进行排序，把排好顺序的数再重新追加写到磁盘的该文件中
        //创建文件对象
        File file = new File("new.txt");
        //创建输入流,输出流
        FileInputStream in = new FileInputStream(file);
        FileOutputStream out = new FileOutputStream("new.txt",true);
        //读取
        //数组排序
        //写入
        byte[] bytes = new byte[1024];
        int readCount;
        //((readcount = InputStream.read(bytes)) != -1)
        //((readCount = in.read(bytes)) != -1)
        while ((readCount = in.read(bytes)) != -1){
            Arrays.sort(bytes);
            out.write(bytes,0,readCount);
        }
        //关闭两个流
        in.close();
        out.close();
    }

}
