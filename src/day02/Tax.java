package day02;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的月收入：");
        double revenue = sc.nextDouble();

        System.out.println("你需要交的税额是" + getTax(revenue));
    }
    public static double getTax(double revenue){
        double tax = 0;
        if (revenue < 2000) {
        } else if (revenue <= 2500) {
            tax = (revenue - 2000) * 0.05;
        } else if (revenue <= 4000) {
            tax = 25 + (revenue - 2500) * 0.1;
        } else if (revenue <= 7000) {
            tax = 175 + (revenue - 4000) * 0.15;
        } else if (revenue <= 22000) {
            tax = 625 + (revenue - 7000) * 0.2;
        } else if (revenue <= 42000) {
            tax = 3625 + (revenue - 22000) * 0.25;
        } else if (revenue <= 62000) {
            tax = 8625 + (revenue - 42000) * 0.3;
        } else if (revenue <= 82000) {
            tax = 14625 + (revenue - 620000) * 0.35;
        } else if (revenue <= 102000) {
            tax = 21625 + (revenue - 82000) * 0.4;
        } else {
            tax = 29625 + (revenue - 102000) * 0.45;
        }
        return tax;
    }

}

