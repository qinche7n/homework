package day03;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a =  10;
        int b  = 20;
        int c = a + b;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("你输入的数大于0");
        } else if (num == 0) {
            System.out.println("你输入的数等于0");
        } else {
            System.out.println("你输入的数小于0");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        method();
    }
    public static void method() {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
    }
}
