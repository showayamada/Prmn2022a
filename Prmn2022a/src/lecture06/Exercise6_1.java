package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        System.out.println("小数を入力してください");
        Scanner input = new Scanner(System.in);
        try {
            float f = input.nextFloat();
            System.out.println("入力した値：" + f);
        } catch (InputMismatchException e) {
            System.out.println("エラー");
        }
    }
}
