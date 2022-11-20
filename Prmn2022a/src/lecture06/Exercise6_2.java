package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        //System.out.println(random.nextInt(100));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i, random.nextInt(6) + 1);

        }

        Scanner input = new Scanner(System.in);
        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？");
        int index = input.nextInt();
        try {
            System.out.println(list.get(index));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました。\nプログラムを終了します。");
        }
    }
}
