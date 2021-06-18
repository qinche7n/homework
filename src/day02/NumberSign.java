package day02;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int column =sc.nextInt();
        int row = sc.nextInt();
        printNumberSign(column,row);
    }
    public static void printNumberSign(int column , int row){
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
