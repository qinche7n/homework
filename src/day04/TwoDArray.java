package day04;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{30, 66, 78}, {10, 33, 20}, {10, 99, 103}, {9, 18, 27}};
        getAvrage(arr[0]);
        getAvrage(arr[1]);
        getAvrage(arr[2]);
        getAvrage(arr[3]);
        getSum(arr);
    }

    private static void getAvrage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("该季度平均销售为" + sum / 3.0);
    }

    private static void getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j : arr[i]) {
                sum += j;

            }
        }
        System.out.println("该年总销售为" + sum);
    }
}

