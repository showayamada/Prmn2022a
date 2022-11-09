package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("任氏の文字列を入力してください");
        String arg = input.next();
        System.out.println("”" + arg +"”と入力されました。");
    }
}
