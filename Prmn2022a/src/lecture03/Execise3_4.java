package lecture03;

import java.util.ArrayList;

public class Execise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> yasai = new ArrayList<>();
        yasai.add(new Vegetable("人参", 117));
        yasai.add(new Vegetable("玉葱", 120));

        for (Vegetable y:yasai){
            y.print();
        }
    }
}
