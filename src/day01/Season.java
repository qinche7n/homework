package day01;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份: ");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("是秋季");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}