package lecture01;

public class kadai5 {
    public static void main(String[] args){
        int[] score = {41, 85, 72, 38, 80};
        System.out.println(min(score));
        System.out.println(max(score));
        System.out.println(average(score));

    }
    //最小値
    static int min(int[] score){
        int min = score[0];

        for(int i = 0; i < score.length; i++) {
            if (min > score[i]){
                min = score[i];
            }
        }
        return min;
    }

    //最大値
    static int max(int[] score){
        int max = score[0];
        for(int i = 0; i < score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }

    //平均
    static double average(int[] score){
        double ave = 0;
        int sum = 0;
        for(int s : score){
            sum = sum + s;
        }
        ave = (double)sum / score.length;

        return ave;
    }
}
