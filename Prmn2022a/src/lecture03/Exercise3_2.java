package lecture03;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();
        System.out.println("何行分入力しますか？");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "行目");
            strList.add(input.nextLine());
        }
        int a = 0;
        for (String s:strList) {
            System.out.println("[" +a + "]" + s);
            a++;
        }
    }
}
