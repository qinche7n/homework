package _test;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        y+= z-- / ++x;
        System.out.println(y);
    }
}
