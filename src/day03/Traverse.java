package day03;

import java.util.Arrays;

public class Traverse {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,6,7,2,9,4,6,4,8};
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        printarr1(arr);
        printarr2(arr);
    }
    public static void printarr1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void printarr2(int[] arr){
        for(int i:arr){
            System.out.print(i);
        }
        System.out.println();

    }

}
