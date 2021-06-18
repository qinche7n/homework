package day03;

public class HappyBoys {
    public static void main(String[] args) {
        int[] scores = new int[]{9,10,8,7,9,10,9,8,9,6};
        getMax(scores);
        getMin(scores);
        getAverage(scores);
    }

    public static void getMax(int[] scores) {
        for (int i = 0; i <scores.length-1 ; i++) {
            if (scores[i]>scores[i+1]){
                int temp;
                temp = scores[i];
                scores[i] = scores[i+1];
                scores[i+1] =temp;
            }else{

            }
        }
        System.out.println("最高分是"+scores[9]);
    }
    public static void getMin(int[] scores) {
        for (int i = 0; i <scores.length-1 ; i++) {
            if (scores[i]<scores[i+1]){
                int temp;
                temp = scores[i];
                scores[i] = scores[i+1];
                scores[i+1] =temp;
            }else{

            }

        }
        System.out.println("最低分是"+scores[9]);
    }

    public static void getAverage(int[] scores) {
        double sum =0;
        for (int i = 0; i <scores.length-1 ; i++) {

            sum += scores[i];

        }
        System.out.println("平均分是"+sum/10);
    }

}

