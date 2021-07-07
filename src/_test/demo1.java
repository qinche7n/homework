package _test;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        char a[] = new char[]{'a', 'b', '中', '*','1','3'};
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                a[i] = (char) (((long)a[i]) + 1);
            }
        }
        System.out.println(Arrays.toString(a));


    }


    //判断数字
    public boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    //判断字母
    public boolean isLetter(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;

    }
}

