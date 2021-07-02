package day17;

import java.io.*;

public class work2 {
    public static void main(String[] args) throws IOException {
        //读取一个文件，这个文件中有随机的一些数字字符，统计这些数字有几个偶数，几个奇数，并且追加写入到该文件末尾
        //创建一个文件对象
        File file = new File("a.txt");
        //创建两个流对象
        FileOutputStream out = new FileOutputStream(file,true);
        FileInputStream in = new FileInputStream(file);
        //读入字符
        int readdata;
        int odd =0;
        int even =0;
        while((readdata=in.read())!=-1){
            //统计奇偶
            if ((readdata % 2)==1){
                odd++;
            }else{
                even++;
            }
        }
        //追加
        String oddString = "奇数:" + odd + "个";
        String evenString = "奇数:" +  +even + "个";
        out.write(oddString.getBytes());
        out.write(evenString.getBytes());
        //关闭两个流
        in.close();
        out.close();
    }
}
