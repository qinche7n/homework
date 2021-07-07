package day18;

import java.io.*;
import java.util.Arrays;

public class work2 {
    public static void main(String[] args) throws IOException {
        File file = new File("noEncryption.txt");
        File file1 = new File("encryption.txt");
        encodeFile(file, file1);

    }

    //设计一个方法
    //
    //public static void encodeFile(File encodingFile, File encodedFile);
    //
    //在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
    //加密算法：
    //数字：
    //如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
    //如果是9的数字，变成0
    //字母字符：
    //如果是非z字符，向右移动一个，比如d变成e, G变成H
    //如果是z，z->a, Z-A。
    //字符需要保留大小写
    //非字母字符
    //比如',&^ 保留不变，中文也保留不变
    public static void encodeFile(File encodingFile, File encodedFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(encodingFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(encodedFile));
        String content;
        while ((content = br.readLine()) != null) {
            char[] a = content.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= '0' && a[i] <= '8') {
                    a[i] = (char) (((long) a[i]) + 1);
                }
                if (a[i] == '9') {
                    a[i] = '0';
                }
                if (a[i] >= 'a' && a[i] <= 'y') {
                    a[i] = (char) (((long) a[i]) + 1);
                }
                if (a[i] == 'z') {
                    a[i] = 'a';
                }
                if (a[i] >= 'A' && a[i] <= 'Y') {
                    a[i] = (char) (((long) a[i]) + 1);
                }if (a[i] == 'Z'){
                    a[i] = 'A';
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
