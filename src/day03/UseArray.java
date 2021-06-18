package day03;

import java.util.Arrays;

public class UseArray {
    public static void main(String[] args) {
        double[] arr = new double[]{9,10,8,7,9,10,9,8,9,6};
        useArray(arr);
    }
    public static void useArray(double[] arr){
        double divisor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]/divisor;
        }
        System.out.println(Arrays.toString(arr));
    }


}
