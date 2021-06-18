package day04;

import java.util.Scanner;

public class VariableParameter {
    public static void main(String[] args) {
        new Scanner(System.in);
        int[] arr = new int[]{1,2,3,9,3,4,23,1};
        System.out.println("这个数组的最大值是"+sendParameter(arr));
    }

    private static int sendParameter(int... args) {
        int max = -999999999;
        for (int element: args){
            if (element>max){
                max = element;
            }
        }
        return max;
    }
}
