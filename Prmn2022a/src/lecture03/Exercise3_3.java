package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<>();
        System.out.println("一つ目の整数を入力");
        strs.add(input.next());
        System.out.println("二つ目の整数を入力");
        strs.add(input.next());
        int x = Integer.parseInt(strs.get(0));
        int y = Integer.parseInt(strs.get(1));
        System.out.println(x + "+" + y + "=" +(x+y));

    }
}
