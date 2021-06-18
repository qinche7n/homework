package day04;

import java.util.Arrays;

public class NoRepeat {
    public static void main(String[] args) {
        double[] arr = new double[]{9, 10, 8, 7, 9, 10, 9, 8, 9, 6, 2, 4, 7, 4, 3, 7, 6};
        System.out.println(Arrays.toString(getNoRepeat(arr)));
    }

    private static double[] getNoRepeat(double[] arr) {
        //确定几个参数，该字母有没有重复，重复了几次，没重复的有哪些，几个最后输出

        int number = 0;
        double[] newarrtemp = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {

            number++;
            int repeatnumber = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeatnumber++;
                }
            }
            if (repeatnumber == 1) {
                newarrtemp[number] = arr[i];
            }
            if (repeatnumber > 1) {
                boolean repeat = false;
                for (int j = 0; j < number; j++) {
                    if (newarrtemp[j] == arr[i]) {
                        repeat = true;
                    }
                }
                if (repeat == false) {
                    newarrtemp[number] = arr[i];
                    System.out.println(arr[i]+"重复了"+repeatnumber);
                }else{
                    number--;
                }
            }
        }
        double[] newarr = new double[number];
        for (int i = 0; i < number; i++) {
            newarr[i] = newarrtemp[i+1];
        }
        return newarr;

    }
}
