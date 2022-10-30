package lecture01;

public class kadai4 {
    public static void main(String[] args){
        int[] array = new int[100];
        int sum = 0;
        //配列に要素番号+1を代入
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        //配列の総和
        //奇数の時、足さない
        for(int j =  0; j < array.length; j++){
            if(j % 2 != 0)continue;
            sum = sum + array[j];
        }
        System.out.println(sum);

    }
}
