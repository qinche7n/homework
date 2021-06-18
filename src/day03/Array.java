package day03;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("请输入十个同学的成绩");
        Scanner sc = new Scanner(System.in);
        double[] arr= new double[10];
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i]= sc.nextDouble();
            sum += arr[i];
        }
        System.out.println("平均分是"+sum/10);

    }
}
