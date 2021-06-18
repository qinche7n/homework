package day02;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTable(number);

    }

    public static void printTable(int n) {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");

            }
            System.out.println("\n");


        }

    }
}