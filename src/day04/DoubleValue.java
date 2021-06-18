package day04;

public class DoubleValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = method(a, b)[0];
        b = method(a, b)[1];
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int[] method(int a, int b) {
        a *= 2;
        b *= 2;
        int[] arr = new int[]{a, b};
        return arr;
    }
}
