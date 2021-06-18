package day01;

import java.util.Scanner;

public class GetScore {
    public static void main(String[] args) {
        System.out.println("请依次输入语文、数学、英语成绩：");
        Scanner sc = new Scanner(System.in);
        double chinesescore = sc.nextDouble();
        double mathscore = sc.nextDouble();
        double englishscore = sc.nextDouble();
        System.out.println("最高分是" + getMaxScore(chinesescore, mathscore, englishscore));
        System.out.println("最低分是" + getMInScore(chinesescore, mathscore, englishscore));
        System.out.println("最平均分是" + getAverageScore(chinesescore, mathscore, englishscore));


    }

    public static double getMaxScore(double a, double b, double c) {
        double max;
        max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        return max;
    }

    public static double getMInScore(double a, double b, double c) {
        double max;
        max = (a < b) ? a : b;
        max = (max < c) ? max : c;
        return max;
    }

    public static double getAverageScore(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
