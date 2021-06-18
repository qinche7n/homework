package day05;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        double[] firstclass = new double[3];
        double[] secondclass = new double[2];
        double[] thirdclass = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一班三个同学的成绩");

        for (int i = 0; i < 3; i++) {
            firstclass[i]=sc.nextDouble();
        }
        System.out.println("请输入二班两个同学的成绩");

        for (int i = 0; i < 2; i++) {
            secondclass[i]=sc.nextDouble();
        }
        System.out.println("请输入三班五个同学的成绩");

        for (int i = 0; i < 5; i++) {
            thirdclass[i]=sc.nextDouble();
        }
    }
}
