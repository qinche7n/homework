package day18;

import java.io.*;
import java.util.Arrays;

public class work3 {

    public static void main(String[] args) throws IOException {
        File file = new File("encryption.txt");
        File file1 = new File("deencryption.txt");
        encodeFile(file, file1);

    }

    //设计一个方法
    //
    //public static void decodeFile(File decodingFile, File decodedFile);
    //
    //在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
    //解密算法：
    //数字：
    //如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
    //如果是0的数字，变成9
    //字母字符：
    //如果是非a字符，向左移动一个，比如e变成d, H变成G
    //如果是a，a->z, A-Z。
    //字符需要保留大小写
    //非字母字符：
    //比如',&^ 保留不变，中文也保留不变
    public static void encodeFile(File encodingFile, File decodedFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(encodingFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(decodedFile));
        String content;
        while ((content = br.readLine()) != null) {
            char[] a = content.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= '1' && a[i] <= '9') {
                    a[i] = (char) (((long) a[i]) - 1);
                }
                if (a[i] == '0') {
                    a[i] = '9';
                }
                if (a[i] >= 'b' && a[i] <= 'z') {
                    a[i] = (char) (((long) a[i]) - 1);
                }
                if (a[i] == 'a') {
                    a[i] = 'z';
                }
                if (a[i] >= 'B' && a[i] <= 'Z') {
                    a[i] = (char) (((long) a[i]) -1);
                }
                if (a[i] == 'A') {
                    a[i] = 'Z';
                }
            }
            bw.write(a);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

